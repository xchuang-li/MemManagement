package cn.com.entity;
/**
 *@describe 来访客户信息
 *@author 作者:陈凯旗
 *@version 2019年8月29日下午8:21:41
 */
public class CustInfo {
	private String custName;//客户姓名
	private int    custAge;//客户年龄
	private String custSex;//客户性别
	private String custIDNum;//客户证件号
	private String custPhone;//客户手机号
	private String custZipCode;//客户邮编
	private String custAdress;//客户地址
	private int    custPayNum;//客户实际缴费金额
	private int    custPayStatus;//客户缴费状态 0 未交   1已交
	
	
	public CustInfo() {
		super();
	}
	public CustInfo(String custName, int custAge, String custSex,
			String custIDNum, String custPhone, String custZipCode,
			String custAdress) {
		super();
		this.custName = custName;
		this.custAge = custAge;
		this.custSex = custSex;
		this.custIDNum = custIDNum;
		this.custPhone = custPhone;
		this.custZipCode = custZipCode;
		this.custAdress = custAdress;
		this.custPayNum = 0;//默认缴费金额是0
		this.custPayStatus = 0;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	public String getCustSex() {
		return custSex;
	}
	public void setCustSex(String custSex) {
		this.custSex = custSex;
	}
	public String getCustIDNum() {
		return custIDNum;
	}
	public void setCustIDNum(String custIDNum) {
		this.custIDNum = custIDNum;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustZipCode() {
		return custZipCode;
	}
	public void setCustZipCode(String custZipCode) {
		this.custZipCode = custZipCode;
	}
	public String getCustAdress() {
		return custAdress;
	}
	public void setCustAdress(String custAdress) {
		this.custAdress = custAdress;
	}
	public int getCustPayNum() {
		return custPayNum;
	}
	public void setCustPayNum(int custPayNum) {
		this.custPayNum = custPayNum;
	}
	public int getCustPayStatus() {
		return custPayStatus;
	}
	public void setCustPayStatus(int custPayStatus) {
		this.custPayStatus = custPayStatus;
	}
}
