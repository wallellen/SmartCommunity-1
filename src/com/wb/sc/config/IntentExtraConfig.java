package com.wb.sc.config;

/**
 * 此类定义Intent跳转携带的参数名称
 * @author liangbx
 *
 */
public interface IntentExtraConfig {
	
	/***************************** 帖子  **********************************************/
	public static final String POST_TYPE = "post_type";
	public static final int POST_TYPE_SHARE = 0;
	public static final int POST_TYPE_HELPE = 1;
	public static final int POST_TYPE_LOVE = 2;
		
	/***************************** 详情页  **********************************************/
	public static final String DETAIL_ID = "id";
	public static final String DETAIL_TYPE = "type";
	
}