package com.web.site.common.consts;

import java.io.Serializable;

/**
 * 系统共用常量
 * <p/>
 * Created by kfc on 2016/6/29.
 */
@SuppressWarnings("serial")
public class PUBConstants implements Serializable {

	/**
	 * 手机端token失效时长：三十天
	 */
	public static int APP_TOKEN_TIME = 60 * 60 * 24 * 30;
	
	/**
	 * REDIS默认失效时间：三十天
	 */
	public static int REDIS_TIME = 60 * 60 * 24 * 30;
	/**
	 * Cookie有效期(分钟)
	 */
	public static final int COOKIE_VALID = 60;
	/**
	 * 数据分隔符
	 */
	public static final String DATA_SEP = "~~";
	/**
	 * redis缓存请求链接超时时长限制：
	 */
	public static int TIME_OUT = 6000;

	/**
	 * Jdk默认时间格式
	 */
	public static final String DEFAULT_DATE_FORMAT_JDK = "yyyy-MM-dd HH:mm:ss";
	/**
	 * Jodd默认时间格式
	 */
	public static final String DEFAULT_DATE_FORMAT_JODD = "YYYY-MM-DD hh:mm:ss";
	public static final String DEFAULT_DATE_FORMAT_STAMP = "YYYYMMDDhhmmss";
	public static final String DEFAULT_DATE_FORMAT_FRONT_STAMP = "YYYY-MM-DD";
	public static final String DEFAULT_DATE_FORMAT_FRONT_HUIFU = "YYYYMMDD";
	public static final String DEFAULT_DATE_FORMAT_FRONT_MONTH_HUIFU = "YYYY-MM";



	/**
	 * Default ase key
	 */
	public static final String DEFAULT_AES_KEY = "mo0NjhD4IVqx0Q==";

	/**
	 * Remember me cookie
	 */
	public static final String REMEMBER_ME_SIGN = "_sign";

	public static final String SESSION_CUR_USER = "_scu";
	public static final String SESSION_CUR_USER_OBJ = "_scu_obj";
	public static final String SESSION_CUR_USER_AUTH = "_scu_auth";
	public static final String SESSION_OPENID = "_openid";

	// 图形验证码缓存
	public static final String CACHE_GRAPH_CAPTCHA = "_graph_captcha";
	// 短信验证码缓存
	public static final String CACHE_SMS_CAPTCHA = "_sms_captcha";
	/**
	 * 默认分页大小
	 */
	public static final int DEFAULT_PAGESIZE = 10;


	/**
	 * {code:**, msg:返回信息.........}
	 */

	/**
	 * ajax成功返回码
	 */
	public static final String SUCCESS_CODE = "1";
	/**
	 * ajax失败返回码
	 */
	public static final String ERROR_CODE = "-1";
	// 表单重复提交返回码
	public static final  String RESUBMIT_CODE = "11";

	/**
	 * JDK默认时间格式
	 */
	public static final String DEFAULT_FORMAT_DATE_JDK = "yyyy-MM-dd HH:mm:ss";
	public static final String DEFAULT_FORMAT_DATE = "yyyy-MM-dd";

	/**
	 * joddDate时间格式
	 */
	public static final String DEFAULT_FORMAT_DATE_JOD = "YYYY-MM-DD hh:mm:ss";

	/**
	 * 可用状态
	 */
	public static final String ENABLE_STATUS = "1";
	/**
	 * 不可用状态
	 */
	public static final String DISABLE_STATUS = "0";
	/**
	 * biao标示
	 */
	public static final String TOKEN = "_token";

	/**
	 * 后台用户对象session
	 */
	public static final String ADMIN_SESSION_USER_OBJ = "_admin_user_obj";
	/**
	 * 后台用户Id session
	 */
	public static final String ADMIN_SESSION_USER = "_admin_user";

	/**
	 * 后台功能按钮
	 */
	public static final String ADMIN_BUTTON = "_admin_button";
	/**
	 * 资源权限
	 */
	public static final String ADMIN_SOURCE_ALL = "_admin_source_all";
	/**
	 * 功能按钮资源权限
	 */
	public static final String ADMIN_SOURCE_REGX = "_admin_source_regx";

	/**
	 * 分页展示条数
	 */
	public static final int APP_PAGE_SIZE = 10;


	/**
	 * 菜单类型
	 */
	public static  final String MENU_TYPE_0 = "0";  // 根目录
	public static  final String MENU_TYPE_1 = "1";  // 一级菜单
	public static  final String MENU_TYPE_2 = "2";  //二级菜单
	public static  final String MENU_TYPE_3 = "3";  //三级菜单
	public static  final String MENU_TYPE_4 = "4";  //按钮
	public static  final String MENU_TYPE_5 = "5";  //超链接
	public static  final String MENU_TYPE_6 = "6";  //非折叠菜单
}
