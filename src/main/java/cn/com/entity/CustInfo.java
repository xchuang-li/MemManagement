package cn.com.entity;
/**
 *@describe ���ÿͻ���Ϣ
 *@author ����:�¿���
 *@version 2019��8��29������8:21:41
 */
public class CustInfo {
	private String custName;//�ͻ�����
	private int    custAge;//�ͻ�����
	private String custSex;//�ͻ��Ա�
	private String custIDNum;//�ͻ�֤����
	private String custPhone;//�ͻ��ֻ���
	private String custZipCode;//�ͻ��ʱ�
	private String custAdress;//�ͻ���ַ
	private int    custPayNum;//�ͻ�ʵ�ʽɷѽ��
	private int    custPayStatus;//�ͻ��ɷ�״̬ 0 δ��   1�ѽ�
	
	
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
		this.custPayNum = 0;//Ĭ�Ͻɷѽ����0
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
