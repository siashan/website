package com.web.site.controller.product;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.web.site.common.controller.BaseController;
import com.web.site.common.orm.Page;
import com.web.site.common.orm.Table;
import com.web.site.common.support.response.ResponseCode;
import com.web.site.common.support.response.Responses;
import com.web.site.common.support.keygen.MyKeyGenerator;
import com.web.site.entity.product.*;
import com.web.site.service.product.*;
import jodd.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: kfc
 * @Description: <br/>
 * Date:Create in 2018/9/11 14:25
 * @Modified By:
 */
@RestController
@RequestMapping("admin/category")
public class CategoryContorller extends BaseController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private CategoryBrandService categoryBrandService;
    @Autowired
    private CategoryPropsService categoryPropsService;
    @Autowired
    private CategoryParamsService categoryParamsService;
    @Autowired
    private CategorySpecService categorySpecService;


    @RequestMapping("loadChildren")
    public Object loadChildren(String level, Long parentId) {
        CategoryExample example = new CategoryExample();
        example.setOrderByClause(" order_by ");
        CategoryExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        criteria.andCatLevelEqualTo(level);
        List<Category> categories = categoryService.selectByExample(example);
        return Responses.success(categories);
    }

    /**
     * Description:类目列表  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/12 9:19
     */
    @RequestMapping("list")
    public Object list() {
        CategoryExample example = new CategoryExample();
        example.setOrderByClause(" order_by ");
        List<Category> categories = categoryService.selectByExample(example);
        return Responses.success(categories);
    }

    /**
     * Description:保存类目  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/12 9:19
     */
    @RequestMapping("save")
    public Object save(Category category, String pcodes) {
        if (null == category.getId()) {
            Long id = MyKeyGenerator.genKey();
            // 计算cat位置
            String catLevel = category.getCatLevel();
            String[] split = pcodes.split("|");
            String catL = "";
            switch (catLevel) {
                case "1":
                    catL = id + "";
                    break;
                case "2":
                    catL = split[1] + "|" + id;
                    break;
                case "3":
                    catL = split[1] + "|" + split[2] + "|" + id;
                    break;
            }
            category.setCreateTime(new Date());
            category.setId(id);
            category.setCatPath(catL);
            categoryService.insertSelective(category);
        } else {
            categoryService.updateByPrimaryKeySelective(category);
        }
        return Responses.success();
    }

    /**
     * Description:删除类目  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/12 9:18
     */
    @RequestMapping("del")
    public Object del(Integer id) {
        return categoryService.deleteByPrimaryKey(id) > 0 ? Responses.success() : Responses.error(ResponseCode.CODE_50005);
    }

    /**
     * Description:加载类目属性  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/12 9:34
     */
    @RequestMapping("loadProps")
    public Object loadProps(Long id) {
        Page page = initPage();
        CategoryPropsExample example = new CategoryPropsExample();
        example.setOrderByClause(" order_by ");
        CategoryPropsExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(id);
        example.setPage(page);
        page.setTotal((int) categoryPropsService.countByExample(example));
        List<CategoryProps> categoryProps = categoryPropsService.selectByExample(example);
        return Responses.table(page.getTotal(), categoryProps);
    }

    /**
     * Description:保存类目属性  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/12 17:49
     */
    @RequestMapping("saveCatProp")
    public Object saveCatProp(CategoryProps categoryProps) {
        if (null == categoryProps.getId()) {
            categoryPropsService.insertSelective(categoryProps);
        } else {
            categoryPropsService.updateByPrimaryKeySelective(categoryProps);
        }
        return Responses.success();
    }

    @RequestMapping("delCatProp")
    public Object delCatProp(Long id) {
        return categoryPropsService.deleteByPrimaryKey(id) > 0 ? Responses.success() : Responses.error(ResponseCode.CODE_50005);
    }

    /**
     * Description:加载类目参数  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/12 9:39
     */
    @RequestMapping("loadParams")
    public Object loadParams(Integer id) {
        CategoryParamsExample example = new CategoryParamsExample();
        example.setOrderByClause(" order_by ");
        CategoryParamsExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(id).andParentIdEqualTo(0);
        List<CategoryParams> categoryParams = categoryParamsService.selectByExample(example);
        return Responses.success(categoryParams);
    }

    @RequestMapping("loadParamsVal")
    public Object loadParamsVal(Integer id) {
        CategoryParamsExample example = new CategoryParamsExample();
        example.setOrderByClause(" order_by ");
        CategoryParamsExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(id);
        List<CategoryParams> categoryParams = categoryParamsService.selectByExample(example);
        return Responses.success(categoryParams);
    }

    /**
     * Description:保存类目参数  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/13 11:07
     */
    @RequestMapping("saveCatParam")
    public Object saveCatParam(CategoryParams categoryParams) {
        if (null == categoryParams.getId()) {
            categoryParamsService.insertSelective(categoryParams);
        } else {
            categoryParamsService.updateByPrimaryKeySelective(categoryParams);
        }
        return Responses.success();
    }

    /**
     * Description:删除类目参数  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/13 11:09
     */
    @RequestMapping("delCatParam")
    public Object delCatParam(Integer id) {
        CategoryParams categoryParams = categoryParamsService.selectByPrimaryKey(id);
        if (categoryParams.getParentId() == 0) {
            categoryParamsService.deleteParamGroup(id);
        } else {
            return categoryParamsService.deleteByPrimaryKey(id) > 0 ? Responses.success() : Responses.error(ResponseCode.CODE_50005);
        }
        return Responses.success();
    }

    /**
     * Description:加载品牌  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/12 9:39
     */
    @RequestMapping("loadBrands")
    public Object loadBrands(Integer id) {
        List<Integer> brands = categoryBrandService.loadBrands(id);
        List<Brand> brandsAll = categoryBrandService.loadBrandsAll();
        JSONArray array = new JSONArray();
        if (!brandsAll.isEmpty()) {
            for (Brand s : brandsAll) {
                JSONObject obj = new JSONObject();
                obj.put("key", s.getId());
                obj.put("label", StringUtil.isBlank(s.getEnName()) ? s.getChName() : s.getEnName() + "/" + s.getChName());
                array.add(obj);
            }
        }
        Map<String, Object> map = new HashMap<>();
        map.put("allBrands", array);
        map.put("ownBrands", brands);
        return Responses.success(map);
    }

    /**
     * Description:保存类目和规格的关联  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/12 16:30
     */
    @RequestMapping("saveCatBrand")
    public Object saveCatBrand(Long categoryId, Long[] brandIds) {
        categoryBrandService.create(categoryId, brandIds);
        return Responses.success();
    }


    /**
     * Description:加载规格  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/12 10:14
     */
    @RequestMapping("loadSpecs")
    public Object loadSpecs(Integer id) {
        List<Spec> allSpecs = categorySpecService.loadAllForTranfer();
        List<Integer> specs = categorySpecService.loadSpecs(id);
        JSONArray arrayAll = new JSONArray();
        fillTransferObj(arrayAll, allSpecs);
        Map<String, Object> map = new HashMap<>();
        map.put("allSpec", arrayAll);
        map.put("ownSpec", specs);
        return Responses.success(map);
    }

    /**
     * Description:保存类目和规格的关联  <br/>
     *
     * @param:
     * @return:
     * @Author: kfc
     * @Date: 2018/9/12 16:30
     */
    @RequestMapping("saveCatSpec")
    public Object saveCatSpec(Long categoryId, Long[] specIds) {
        categorySpecService.create(categoryId, specIds);
        return Responses.success();
    }


    public void fillTransferObj(JSONArray arr, List<Spec> specs) {
        if (!specs.isEmpty()) {
            for (Spec s : specs) {
                JSONObject obj = new JSONObject();
                obj.put("key", s.getId());
                obj.put("label", s.getSpecName() + "--" + s.getSpecMeno());
                arr.add(obj);
            }
        }
    }


}
