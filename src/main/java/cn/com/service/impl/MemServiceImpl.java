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
 *@descibe ��Ա�����߼�������
 *@author ����:�¿���
 *@version 2019��8��29������6:39:53
 */
public  class MemServiceImpl implements MemberService {
   
	//��Ա�ֿ�
	private List<MemInfo> listMems = new ArrayList<MemInfo>();
	
	
	//ע���Ա
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
		System.out.println("ע��ɹ�!");
        return meminfo;
	}
    
	//�ɷ�    registerDate��ʼע��ʱ��  yyyy-MM-dd HH:mm:ss
	public void payAnnualFee(String memType,CustInfo person, String registerDate) {
		//�ж��Ƿ񳬹�24Сʱ
		if(!MemUntil.ifOver24Hour(registerDate)){
			if(person.getCustPayNum() >= 
					MemConstant.MemType_PayMoney_Enum.getPayMoneyByType(memType)){
				person.setCustPayStatus(MemConstant.CUST_PAY);
				System.out.println("�ɷѳɹ���");
			}else{
				throw new memException(MemErrorConstant.MEM_PAYNAMOUNT_ERRORCODE, 
						MemErrorConstant.MEM_PAYNAMOUNT_ERRORMESSAGE);
			}
		}else{
			throw new memException(MemErrorConstant.MEM_PAYDATE_ERRORCODE, 
					MemErrorConstant.MEM_PAYDATE_ERRORMESSAGE);
		}
	}
	
    //���ݻ�Ա���Ų�ѯ��Ա��Ϣ
	public MemInfo findByCard(String memCardNO) {
		for (MemInfo memInfo : listMems) {
			if(memInfo.getMemCardNO().equals(memCardNO) ){
				System.out.println("����"+memCardNO+"�Ļ�Ա��Ϣ��"+memInfo.toString());
				return memInfo;
			}
		}
		return null;
	}
}
