package cn.com.factory;

import cn.com.constant.MemConstant;
import cn.com.entity.MemInfo;
import cn.com.entity.CustInfo;

/**
 *@describe ��Ա������
 *@author ����:�¿���
 *@version 2019��8��29������6:13:10
 */
public class MemFactory {
	
	private static MemInfo member = null;
	
	//¼�������Ա��Ϣ
	public static MemInfo createBastMeminfo(CustInfo custinfo){
		member = new MemInfo();
		member.setMemName(custinfo.getCustName());
		member.setMemSex(custinfo.getCustSex());
		member.setMemIDNum(custinfo.getCustIDNum());
		member.setMemPhone(custinfo.getCustPhone());
		member.setMemAdress(custinfo.getCustAdress());
		member.setMemZipCode(custinfo.getCustZipCode());
		member.setMemSate(MemConstant.MEM_STATE_UNACTIVE);//Ĭ��δ����״̬
		return member;
	}
	
	//���ݻ�Ա���ʹ�����ͬ�Ļ�Ա����
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
