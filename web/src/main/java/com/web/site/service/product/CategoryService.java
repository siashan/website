package com.web.site.service.product;

import com.web.site.dao.product.CategoryMapper;
import com.web.site.entity.product.Category;
import com.web.site.entity.product.CategoryExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
    * 商品类目表 服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-09-29
 */
@Service
public class CategoryService extends BaseService<CategoryMapper, Category, CategoryExample> {

	public List<Category> selectAll() {
	    CategoryExample example = new CategoryExample();
	    example.setOrderByClause(" order_by ");
	    return selectByExample(example);
	}

	public List<Map<String, Object>> selectAllForSelect() {
	    List<Map<String, Object>> maps = baseMapper.selectAllForSelect();
	    List<Map<String, Object>> catLevel1 = maps.stream().filter((Map cat) -> (Long) cat.get("parentId") == 0).collect(Collectors.toList());
	    fillCatJson(catLevel1, maps);
	    return catLevel1;
	}

	private void fillCatJson(List<Map<String, Object>> child2, List<Map<String, Object>> maps) {
	    for (Map<String, Object> map3 : child2) {
	        List<Map<String, Object>> child3 = maps.stream().filter((Map cat) -> (Long) cat.get("parentId") == map3.get("value")).collect(Collectors.toList());
	        if (!child3.isEmpty()) {
	            map3.put("children", child3);
	        }
	        fillCatJson(child3, maps);
	    }
	}


}