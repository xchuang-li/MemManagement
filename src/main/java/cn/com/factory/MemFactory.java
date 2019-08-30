package cn.com.factory;

import cn.com.constant.MemConstant;
import cn.com.entity.MemInfo;
import cn.com.entity.CustInfo;

/**
 *@describe 会员工厂类
 *@author 作者:陈凯旗
 *@version 2019年8月29日下午6:13:10
 */
public class MemFactory {
	
	private static MemInfo member = null;
	
	//录入基本会员信息
	public static MemInfo createBastMeminfo(CustInfo custinfo){
		member = new MemInfo();
		member.setMemName(custinfo.getCustName());
		member.setMemSex(custinfo.getCustSex());
		member.setMemIDNum(custinfo.getCustIDNum());
		member.setMemPhone(custinfo.getCustPhone());
		member.setMemAdress(custinfo.getCustAdress());
		member.setMemZipCode(custinfo.getCustZipCode());
		member.setMemSate(MemConstant.MEM_STATE_UNACTIVE);//默认未激活状态
		return member;
	}
	
	//根据会员类型创建不同的会员对象
	public static MemInfo createMemByMemType(String memType,CustInfo custinfo){
		member = createBastMeminfo(custinfo);
		if(memType.equals(MemConstant.PU_KA)){
			member.setMemType(MemConstant.PU_KA);
		}else if(memType.equals(MemConstant.JIN_KA)){
			member.setMemType(MemConstant.JIN_KA);
		}else if(memType.equals(MemConstant.BAIJIN_KA)){
			member.setMemType(MemConstant.BAIJIN_KA);
		}else if(memType.equals(MemConstant.ZUANSHI_KA)){
			member.setMemType(MemConstant.ZUANSHI_KA);
		}
		
		return member;
	}
	
	
}
