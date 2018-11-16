package com.web.site.service.sys;

import com.web.site.dao.sys.SysDictMapper;
import com.web.site.entity.sys.SysDict;
import com.web.site.entity.sys.SysDictExample;
import com.web.site.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
    *  服务实现类
    * </p>
 *
 * @author Small
 * @since 2018-07-27
 */
@Service
public class SysDictService extends BaseService<SysDictMapper, SysDict, SysDictExample> {

	public Map<String, Object> initDict() {
	    //        logger.info("加载数据字典并缓存");
	    //        Map<String, Object> dict = (Map<String, Object>) redisUtil.get("dict");
	    //        if (null != dict) {
	    //            return dict;
	    //        }
	    Map<String, Object> dicts = new HashMap();
	    List<SysDict> allDict = selectAll();
	    for (SysDict dic : allDict) {
	        //添加redis缓存 key:group_code value:name
	        Object obj = dicts.get(dic.getDictGroup());
	        if (obj == null) {
	            List<SysDict> temp = new ArrayList();
	            temp.add(dic);
	            dicts.put(dic.getDictGroup(), temp);
	        } else {
	            List<SysDict> temp = (List<SysDict>) obj;
	            temp.add(dic);
	        }
	    }
	    //        redisUtil.set("dict", dicts);
	    return dicts;
	}

	/**
     * 初始化数据字典，转换成map
     *
     * @return
     */
	@SuppressWarnings("unchecked")
	public Map<String, Object> initDictMap() {
	    //        Map<String, Object> dictMap = (Map<String, Object>) redisUtil.get("dictMap");
	    //        if (null != dictMap) {
	    //            return dictMap;
	    //        }
	    Map<String, Object> dicts = new HashMap();
	    List<SysDict> allDict = selectAll();
	    for (SysDict dic : allDict) {
	        Object obj = dicts.get(dic.getDictGroup());
	        if (obj == null) {
	            Map<String, String> temp = new HashMap();
	            temp.put("d_" + dic.getDictCode(), dic.getDictName());
	            dicts.put(dic.getDictGroup(), temp);
	        } else {
	            Map<String, String> temp = (Map<String, String>) obj;
	            temp.put("d_" + dic.getDictCode(), dic.getDictName());
	        }
	    }
	    //        redisUtil.set("dictMap", dicts);
	    return dicts;
	}

	public List<SysDict> selectAll() {
	    SysDictExample example = new SysDictExample();
	    example.setOrderByClause(" id ");
	    List<SysDict> allDict = selectByExample(example);
	    return allDict;
	}


}