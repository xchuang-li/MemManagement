package cn.com.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.com.constant.MemConstant;
import cn.com.constant.MemErrorConstant;
import cn.com.entity.MemInfo;
import cn.com.entity.CustInfo;
import cn.com.exception.memException;
import cn.com.factory.MemFactory;
import cn.com.service.MemberService;
import cn.com.until.MemUntil;

/**
 *@descibe 会员管理逻辑处理类
 *@author 作者:陈凯旗
 *@version 2019年8月29日下午6:39:53
 */
public  class MemServiceImpl implements MemberService {
   
	//会员仓库
	private List<MemInfo> listMems = new ArrayList<MemInfo>();
	
	
	//注册会员
	public MemInfo register(String memType,CustInfo custinfo,String startDate) {
		MemInfo meminfo = null;
		if(MemUntil.checkAge(custinfo.getCustAge())){
			meminfo = MemFactory.createMemByMemType(memType, custinfo);
			payAnnualFee(memType,custinfo,startDate);
			if(custinfo.getCustPayStatus() == MemConstant.CUST_PAY ){
			   meminfo.setMemSate(MemConstant.MEM_STATE_ACTIVE);
			   meminfo.setMemCardNO(MemUntil.produceCardNo(memType));
			}
			listMems.add(meminfo);
		}else{
			throw new memException(MemErrorConstant.MEM_AGE_ERRORCODE, 
					MemErrorConstant.MEM_AGE_ERRORMESSAGE);
		}
		System.out.println("注册成功!");
        return meminfo;
	}
    
	//缴费    registerDate开始注册时间  yyyy-MM-dd HH:mm:ss
	public void payAnnualFee(String memType,CustInfo person, String registerDate) {
		//判断是否超过24小时
		if(!MemUntil.ifOver24Hour(registerDate)){
			if(person.getCustPayNum() >= 
					MemConstant.MemType_PayMoney_Enum.getPayMoneyByType(memType)){
				person.setCustPayStatus(MemConstant.CUST_PAY);
				System.out.println("缴费成功！");
			}else{
				throw new memException(MemErrorConstant.MEM_PAYNAMOUNT_ERRORCODE, 
						MemErrorConstant.MEM_PAYNAMOUNT_ERRORMESSAGE);
			}
		}else{
			throw new memException(MemErrorConstant.MEM_PAYDATE_ERRORCODE, 
					MemErrorConstant.MEM_PAYDATE_ERRORMESSAGE);
		}
	}
	
    //根据会员卡号查询会员信息
	public MemInfo findByCard(String memCardNO) {
		for (MemInfo memInfo : listMems) {
			if(memInfo.getMemCardNO().equals(memCardNO) ){
				System.out.println("卡号"+memCardNO+"的会员信息："+memInfo.toString());
				return memInfo;
			}
		}
		return null;
	}
}
