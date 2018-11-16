package com.web.site.service.product;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.web.site.dao.product.ProductItemsMapper;
import com.web.site.entity.product.ProductItems;
import com.web.site.entity.product.ProductItemsExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
    * 商品类目表 服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-08-30
 */
@Service
public class ProductItemsService extends BaseService<ProductItemsMapper, ProductItems, ProductItemsExample> {

	public JSONArray selectTree(String usefor) {
	    List<ProductItems> items = baseMapper.selectTop2Level();
	    List<ProductItems> level1 = items.stream().filter((ProductItems p) -> p.getItemLevel().equals("1")).collect(Collectors.toList());
	    JSONArray jarry = new JSONArray();
	    if ("1".equals(usefor)) {
	        JSONObject rootJsonNode = fillNOdeJson(1, "根目录");
	        if (!level1.isEmpty()) {
	            sortList(level1);
	            JSONArray jarry1 = new JSONArray();
	            for (ProductItems pi : level1) {
	                JSONObject jobj = fillNOdeJson(pi.getId(), pi.getItemName());
	                List<ProductItems> level2 = items.stream().filter((ProductItems p) -> p.getParentId().intValue() == pi.getId().intValue()).collect(Collectors.toList());
	                if (!level2.isEmpty()) {
	                    sortList(level2);
	                    JSONArray jarry2 = new JSONArray();
	                    for (ProductItems items1 : level2) {
	                        jarry2.add(fillNOdeJson(items1.getId(), items1.getItemName()));
	                    }
	                    jobj.put("children", jarry2);
	                    // 移除已经计算的元素，减少后续循环次数
	                    items.removeAll(level2);
	                }
	                jarry1.add(jobj);
	            }
	            rootJsonNode.put("children", jarry1);
	        }
	        jarry.add(rootJsonNode);
	    } else if ("2".equals(usefor)) {
	        if (!level1.isEmpty()) {
	            sortList(level1);
	            for (ProductItems pi : level1) {
	                JSONObject jobj = fillNodeJsonForSelect(pi.getId(), pi.getItemName());
	                List<ProductItems> level2 = items.stream().filter((ProductItems p) -> p.getParentId().intValue() == pi.getId().intValue()).collect(Collectors.toList());
	                if (!level2.isEmpty()) {
	                    sortList(level2);
	                    JSONArray jarry2 = new JSONArray();
	                    for (ProductItems items1 : level2) {
	                        jarry2.add(fillNodeJsonForSelect(items1.getId(), items1.getItemName()));
	                    }
	                    jobj.put("children", jarry2);
	                    // 移除已经计算的元素，减少后续循环次数
	                    items.removeAll(level2);
	                }
	                jarry.add(jobj);
	            }
	        }
	    }
	    return jarry;
	}

	private JSONObject fillNOdeJson(Integer id, String name) {
	    JSONObject jobj1 = new JSONObject();
	    jobj1.put("id", id);
	    jobj1.put("label", name);
	    return jobj1;
	}

	JSONObject fillNodeJsonForSelect(Integer id, String name) {
	    JSONObject jobj1 = new JSONObject();
	    jobj1.put("value", id);
	    jobj1.put("label", name);
	    return jobj1;
	}

	/**
	     * Description:对list集合排序  <br/>
	     *
	     * @param:
	     * @return:
	     * @Author: kfc
	     * @Date: 2018/8/10 17:11
	     */
	private void sortList(List<ProductItems> list) {
	    list.sort(new Comparator<ProductItems>() {
	
	        @Override
	        public int compare(ProductItems o1, ProductItems o2) {
	            return o1.getOrderBy().intValue() - o2.getOrderBy().intValue();
	        }
	    });
	}

	public List<ProductItems> loadLevel3(Integer id) {
	    ProductItemsExample example = new ProductItemsExample();
	    example.setOrderByClause(" order_by ");
	    example.createCriteria().andParentIdEqualTo(id);
	    return selectByExample(example);
	}

	public int updateByPrimaryKeySelectiveOptimistic(ProductItems items) {
	    return baseMapper.updateByPrimaryKeySelectiveOptimistic(items);
	}

	public JSONArray selectChild(Integer id, String usefor) {
	    ProductItemsExample example = new ProductItemsExample();
	    example.setOrderByClause(" order_by ");
	    ProductItemsExample.Criteria criteria = example.createCriteria();
	    criteria.andParentIdEqualTo(id).andItemLevelEqualTo("3");
	    List<ProductItems> productItems = selectByExample(example);
	    JSONArray arr = new JSONArray();
	    if (!productItems.isEmpty()) {
	        for (ProductItems pi : productItems) {
	            if ("1".equals(usefor)) {
	                arr.add(fillNOdeJson(pi.getId(), pi.getItemName()));
	            } else if ("2".equals(usefor)) {
	                arr.add(fillNodeJsonForSelect(pi.getId(), pi.getItemName()));
	            }
	        }
	    }
	    return arr;
	}


}