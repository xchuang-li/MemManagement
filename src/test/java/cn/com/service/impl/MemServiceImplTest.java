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
 *@author 作者:陈凯旗
 *@version 2019年8月29日下午10:26:03
 */
public class MemServiceImplTest {
	
	private MemServiceImpl ms = new MemServiceImpl();
	private MemInfo meminfo = null;

	@Test
	public void testRegister() {
		//客户来访  0-男；  1-女
		CustInfo custinfo = new CustInfo("小明",55,"0",
				"123456789","18888888888","450000","河南柘城");
		//缴费金额
		custinfo.setCustPayNum(55555);
		meminfo = ms.register(MemConstant.ZUANSHI_KA, custinfo, "2019-08-30 10:31:40");
	}

	@Test
	public void testPayAnnualFee() {
		//客户来访  0-男；  1-女
		CustInfo custinfo = new CustInfo("小明",55,"0",
				"123456789","18888888888","450000","河南柘城");
		//缴费金额
		custinfo.setCustPayNum(55555);
		ms.payAnnualFee(MemConstant.ZUANSHI_KA, custinfo, "2019-08-30 10:31:40");
	}

	@After
	public void testFindByCard() {
		ms.findByCard(meminfo.getMemCardNO());
	}

}
