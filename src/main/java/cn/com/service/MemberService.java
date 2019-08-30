package cn.com.service;

import cn.com.entity.MemInfo;
import cn.com.entity.CustInfo;

/**
 *@describe 会员管理功能接口
 *@author 作者:陈凯旗
 *@version 2019年8月29日下午6:09:57
 */
public interface MemberService {
	
	
	//会员注册
	public  MemInfo register(String memType,CustInfo custinfo,String startDate);
	
	//缴纳年费
	public  void payAnnualFee(String memType,CustInfo custinfo,String startDate);
	
	//查询会员的详细信息
	public  MemInfo findByCard(String memIDNum );

}
