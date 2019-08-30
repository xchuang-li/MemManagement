package cn.com.constant;
/**
 *@describe 会员常量信息 
 *@author 作者:陈凯旗
 *@version 2019年8月29日下午5:54:12
 */
public interface MemConstant {
	
	//会员类型
	public static final String PU_KA = "1";//普卡
	public static final String JIN_KA = "2";//金卡
	public static final String BAIJIN_KA = "6";//白金卡
	public static final String ZUANSHI_KA = "9";//钻石卡
	
	//会员状态
	public static final String MEM_STATE_UNACTIVE = "0";//未激活
	public static final String MEM_STATE_ACTIVE = "1";//已激活
	//会员卡年费
	public static final int PU_KA_YEAR_FEE = 0;//普卡年费
	public static final int JIN_KA_YEAR_FEE = 100;//金卡年费
	public static final int BAIJIN_KA_YEAR_FEE = 500;//白金卡年费
	public static final int ZUANSHI_KA_YEAR_FEE= 2000;;//钻石卡年费
	
	//会员性别
	public static final String MAN_SEX = "0";//男
	public static final String WOMAN_SEX = "1";//女
	
	//会员年龄限制
	public static final int MAN_AGE_MIN = 18;//会员最低年龄
	//会员卡总位数
	public static final int MEM_KA_LENGTH = 8;
	//会员卡 不包括前缀卡类型位数
	public static final int MEM_KA_NOPRE_LENGTH = 7;
	//会员卡 不包括前缀后缀和吉利数字
	public static final int MEM_KA_NOPRESUFFLUCY_LENGTH = 5;
	
	//缴费时效性
	public static final int PAY_VALITTIME = 24;
	
	//客户是否缴费 0-未缴费  1-缴费
	public static final int CUST_UNPAY = 0;//未缴费
	public static final int CUST_PAY = 1;//1缴费
	
	//会员类型和缴费金额映射
	enum MemType_PayMoney_Enum {
		PU_KA(0,"1"),JIN_KA(100,"2"),BAIJIN_KA(500,"6"),ZUANSHI_KA(2000,"9");
	    private int  payMoney;
	    private String  memType;
	    private MemType_PayMoney_Enum(int payMoney,String memType){
	    	this.payMoney = payMoney;
	    	this.memType =  memType;
	    }
	    
	    public static int getPayMoneyByType(String memType){
	    	for (MemType_PayMoney_Enum mpe : MemType_PayMoney_Enum.values()) {
				if(mpe.getMemType().equals(memType)){
					return mpe.getPayMoney();
				}
			}
	    	return -1;
	    }
		public int getPayMoney() {
			return payMoney;
		}
		public void setPayMoney(int payMoney) {
			this.payMoney = payMoney;
		}

		public String getMemType() {
			return memType;
		}

		public void setMemType(String memType) {
			this.memType = memType;
		}
		
	}
	
}
