package cn.com.constant;
/**
 *
 *@author 作者:陈凯旗
 *@version 2019年8月30日上午10:14:40
 */
public interface MemErrorConstant {
	
	//年龄校验
	public static final String MEM_AGE_ERRORCODE = "memerror001";
	public static final String MEM_AGE_ERRORMESSAGE = "客户年龄不符合！";
	
	//注册时间和缴费时间 时效校验
	public static final String MEM_PAYDATE_ERRORCODE = "memerror002";
	public static final String MEM_PAYDATE_ERRORMESSAGE = "必须在24小时内缴费！";
	
	//缴费校验
	public static final String MEM_PAYNAMOUNT_ERRORCODE = "memerror003";
	public static final String MEM_PAYNAMOUNT_ERRORMESSAGE = "未足额缴费！";


}
