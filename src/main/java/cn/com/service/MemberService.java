package cn.com.service;

import cn.com.entity.MemInfo;
import cn.com.entity.CustInfo;

/**
 *@describe ��Ա�����ܽӿ�
 *@author ����:�¿���
 *@version 2019��8��29������6:09:57
 */
public interface MemberService {
	
	
	//��Աע��
	public  MemInfo register(String memType,CustInfo custinfo,String startDate);
	
	//�������
	public  void payAnnualFee(String memType,CustInfo custinfo,String startDate);
	
	//��ѯ��Ա����ϸ��Ϣ
	public  MemInfo findByCard(String memIDNum );

}
