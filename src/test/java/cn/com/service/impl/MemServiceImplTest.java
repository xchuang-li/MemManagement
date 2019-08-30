package cn.com.service.impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.com.constant.MemConstant;
import cn.com.entity.CustInfo;
import cn.com.entity.MemInfo;

/**
 *
 *@author ����:�¿���
 *@version 2019��8��29������10:26:03
 */
public class MemServiceImplTest {
	
	private MemServiceImpl ms = new MemServiceImpl();
	private MemInfo meminfo = null;

	@Test
	public void testRegister() {
		//�ͻ�����  0-�У�  1-Ů
		CustInfo custinfo = new CustInfo("С��",55,"0",
				"123456789","18888888888","450000","�����ϳ�");
		//�ɷѽ��
		custinfo.setCustPayNum(55555);
		meminfo = ms.register(MemConstant.ZUANSHI_KA, custinfo, "2019-08-30 10:31:40");
	}

	@Test
	public void testPayAnnualFee() {
		//�ͻ�����  0-�У�  1-Ů
		CustInfo custinfo = new CustInfo("С��",55,"0",
				"123456789","18888888888","450000","�����ϳ�");
		//�ɷѽ��
		custinfo.setCustPayNum(55555);
		ms.payAnnualFee(MemConstant.ZUANSHI_KA, custinfo, "2019-08-30 10:31:40");
	}

	@After
	public void testFindByCard() {
		ms.findByCard(meminfo.getMemCardNO());
	}

}
