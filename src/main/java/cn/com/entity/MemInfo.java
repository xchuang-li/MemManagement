package cn.com.entity;
/**
 *@decribe ��Ա��Ϣ��
 *@author ����:�¿���
 *@version 2019��8��29������5:49:34
 */
public class MemInfo{
	private String memCardNO;//��Ա����
	private String memName;//��Ա����
	private String memSex;//��Ա�Ա�
	private String memIDNum;//��Ա֤����
	private String memType;//��Ա����
	private String memPhone;//��Ա��ϵ��ʽ
	private String memZipCode;//��Ա�ʱ�
	private String memAdress;//��Ա��ַ
	private String memSate;//��Ա״̬
	public MemInfo() {
		super();
	}
	public MemInfo(String memCardNO,String memName, String memSex, String memIDNum,
			String memType, String memPhone, String memZipCode, 
			String memAdress,String memState) {
		super();
		this.memCardNO = memCardNO;
		this.memName = memName;
		this.memSex = memSex;
		this.memIDNum = memIDNum;
		this.memType = memType;
		this.memPhone = memPhone;
		this.memZipCode = memZipCode;
		this.memAdress = memAdress;
		this.memSate = memState;
	}
	
	public String getMemCardNO() {
		return memCardNO;
	}
	public void setMemCardNO(String memCardNO) {
		this.memCardNO = memCardNO;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemSex() {
		return memSex;
	}
	public void setMemSex(String memSex) {
		this.memSex = memSex;
	}
	public String getMemIDNum() {
		return memIDNum;
	}
	public void setMemIDNum(String memIDNum) {
		this.memIDNum = memIDNum;
	}
	public String getMemType() {
		return memType;
	}
	public void setMemType(String memType) {
		this.memType = memType;
	}
	public String getMemPhone() {
		return memPhone;
	}
	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	public String getMemZipCode() {
		return memZipCode;
	}
	public void setMemZipCode(String memZipCode) {
		this.memZipCode = memZipCode;
	}
	public String getMemAdress() {
		return memAdress;
	}
	public void setMemAdress(String memAdress) {
		this.memAdress = memAdress;
	}
	
	public String getMemSate() {
		return memSate;
	}
	public void setMemSate(String memSate) {
		this.memSate = memSate;
	}
	
	@Override
	public String toString() {
		return "MemInfo [memCardNO=" + memCardNO + ", memName=" + memName
				+ ", memSex=" + memSex + ", memIDNum=" + memIDNum
				+ ", memType=" + memType + ", memPhone=" + memPhone
				+ ", memZipCode=" + memZipCode + ", memAdress=" + memAdress
				+ ", memSate=" + memSate + "]";
	}
	
}
