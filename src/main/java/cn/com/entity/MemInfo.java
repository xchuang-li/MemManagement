package cn.com.entity;
/**
 *@decribe 会员信息表
 *@author 作者:陈凯旗
 *@version 2019年8月29日下午5:49:34
 */
public class MemInfo{
	private String memCardNO;//会员卡号
	private String memName;//会员姓名
	private String memSex;//会员性别
	private String memIDNum;//会员证件号
	private String memType;//会员类型
	private String memPhone;//会员联系方式
	private String memZipCode;//会员邮编
	private String memAdress;//会员地址
	private String memSate;//会员状态
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
