package com.web.site;

import com.web.site.common.consts.PUBConstants;
import com.web.site.entity.sys.SysDict;
import com.web.site.entity.sys.SysLog;
import com.web.site.entity.sys.SysMenu;
import com.web.site.entity.sys.SysMenuExample;
import com.web.site.service.sys.SysDictService;
import com.web.site.service.sys.SysLogService;
//import io.shardingsphere.core.keygen.DefaultKeyGenerator;
import com.web.site.service.sys.SysMenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTests {



	@Autowired
	private SysDictService sysDictService;
	@Autowired
	private SysLogService sysLogService;
	@Autowired
	private SysMenuService sysMenuService;

	@Test
	public void contextLoads() {

//
//		List<SysDict> sysDicts = sysDictService.selectAll();
//		System.out.println(sysDicts.size());


//		SysLog log = new SysLog();
//		DefaultKeyGenerator keyGenerator = new DefaultKeyGenerator();
//		log.setId(keyGenerator.generateKey().longValue());
//		log.setUrl("/test");
//		log.setOperator(1l);
//		log.setCreateTime(new Date());
//		log.setRemark("111");
//		sysLogService.insert(log);


		// 测试递归查询+Java多进程
		SysMenuExample example = new SysMenuExample();
		example.setOrderByClause(" id ");
		List<SysMenu> sysMenus = sysMenuService.selectByExample(example);
		List<SysMenu> list = new ArrayList<>();

		SysMenu rootMenu = sysMenus.get(0);
		list.add(rootMenu);

		long start = System.currentTimeMillis();
		fillMenu(list,sysMenus,rootMenu);
		long end = System.currentTimeMillis();
		System.out.println("用时：" + (end - start));
//		for(SysMenu l : list){
//			System.out.println(l.getId() + "---" + l.getName() + "--" + l.getOrderBy());
//		}
	}


	private void fillMenu(List<SysMenu> reList,List<SysMenu> srcMenus , SysMenu rootMenu){
		List<SysMenu> menuList1 =  srcMenus.stream().filter((SysMenu m1) -> m1.getParentId().longValue() == rootMenu.getId().longValue()).collect(Collectors.toList());
		menuList1.sort(new Comparator<SysMenu>() {
			@Override
			public int compare(SysMenu o1, SysMenu o2) {
				return o1.getOrderBy() - o2.getOrderBy();
			}
		});
		if (!menuList1.isEmpty()){
			for (SysMenu m : menuList1){
				reList.add(m);
				fillMenu(reList,srcMenus,m);
			}
		}
	}

}
