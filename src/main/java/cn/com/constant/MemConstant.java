package cn.com.constant;
/**
 *@describe ��Ա������Ϣ 
 *@author ����:�¿���
 *@version 2019��8��29������5:54:12
 */
public interface MemConstant {
	
	//��Ա����
	public static final String PU_KA = "1";//�տ�
	public static final String JIN_KA = "2";//��
	public static final String BAIJIN_KA = "6";//�׽�
	public static final String ZUANSHI_KA = "9";//��ʯ��
	
	//��Ա״̬
	public static final String MEM_STATE_UNACTIVE = "0";//δ����
	public static final String MEM_STATE_ACTIVE = "1";//�Ѽ���
	//��Ա�����
	public static final int PU_KA_YEAR_FEE = 0;//�տ����
	public static final int JIN_KA_YEAR_FEE = 100;//�����
	public static final int BAIJIN_KA_YEAR_FEE = 500;//�׽����
	public static final int ZUANSHI_KA_YEAR_FEE= 2000;;//��ʯ�����
	
	//��Ա�Ա�
	public static final String MAN_SEX = "0";//��
	public static final String WOMAN_SEX = "1";//Ů
	
	//��Ա��������
	public static final int MAN_AGE_MIN = 18;//��Ա�������
	//��Ա����λ��
	public static final int MEM_KA_LENGTH = 8;
	//��Ա�� ������ǰ׺������λ��
	public static final int MEM_KA_NOPRE_LENGTH = 7;
	//��Ա�� ������ǰ׺��׺�ͼ�������
	public static final int MEM_KA_NOPRESUFFLUCY_LENGTH = 5;
	
	//�ɷ�ʱЧ��
	public static final int PAY_VALITTIME = 24;
	
	//�ͻ��Ƿ�ɷ� 0-δ�ɷ�  1-�ɷ�
	public static final int CUST_UNPAY = 0;//δ�ɷ�
	public static final int CUST_PAY = 1;//1�ɷ�
	
	//��Ա���ͺͽɷѽ��ӳ��
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
