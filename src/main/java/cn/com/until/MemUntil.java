package cn.com.until;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

import cn.com.constant.MemConstant;

/**
 *@describe ��Ա������
 *@author ����:�¿���
 *@version 2019��8��29������6:30:13
 */
public class MemUntil {
	
	private static Random random = new Random();
	
	
	//��������Ƿ񳬹�18��
	public static boolean checkAge(int custAge){
		if(custAge >= MemConstant.MAN_AGE_MIN){
			return true;
		}else{
			return false;
		}
	}
	
	//��ȡ����λ
	public static double getChengShu(int randomSize,int count){
		return Math.pow(10.0, count-randomSize);
	}
	
	//�������7λ��  ��ͨ��Ա�ͽ𿨻�Ա
	public static String genernateSevenNum(){
		int randomNum = random.nextInt(10000000);
		String randomNumStr = String.valueOf(randomNum);
		randomNum *= getChengShu(randomNumStr.length(),MemConstant.MEM_KA_NOPRE_LENGTH);
		return String.valueOf(randomNum);
	}
	
	//��ʯ���ͽ�  �������5λ���֣�������ǰ׺��׺�ͼ������ֵ����֣�  �ұ�֤ ��������4��7
	public static String genernateFiveNum(){
		//���ظ�ȡ����
		char[] replace7Array = new char[]{'0','1','2','3','4','5','6','8','9'};
		//���ظ�ȡ������
		char[] replace4Array = new char[]{'0','1','2','3','5','6','7','8','9'};
		
		int randomNum = random.nextInt(100000);
		String randomNumStr = String.valueOf(randomNum);
		
		randomNum *= getChengShu(randomNumStr.length(),MemConstant.MEM_KA_NOPRESUFFLUCY_LENGTH);
		char[]  randomChar = String.valueOf(randomNum).toCharArray();
		for (int i = 0; i < randomChar.length -1; i++) {
			if(randomChar[i] == '4' && randomChar[i+1] == '4'){
				randomChar[i+1] = replace4Array[random.nextInt(9)];
			}
			if(randomChar[i] == '7' && randomChar[i+1] == '7'){
				randomChar[i+1] = replace7Array[random.nextInt(9)];
			}
		}
		return new String(randomChar);
	}
	
	//���ݻ�Ա���ʹ�������
	public static String  produceCardNo(String memType){
		//��������
		int[] luckyArray = new int[]{6,8,9};
		//��׺β��ȡ��
		int[] suffixArray = new int[]{0,1,2,3,5,6,8,9};
		
		StringBuilder  sb = new StringBuilder();
		sb.append(memType);
		if(MemConstant.PU_KA.equals(memType)
				|| MemConstant.JIN_KA.equals(memType)){
			sb.append(genernateSevenNum());
		}else if(MemConstant.BAIJIN_KA.equals(memType)
				|| MemConstant.ZUANSHI_KA.equals(memType)){
			sb.append(luckyArray[random.nextInt(3)]);
			sb.append(genernateFiveNum()).append(suffixArray[random.nextInt(8)]);
		}
		System.out.println("���ɻ�Ա���ţ�"+sb);
		return sb.toString();
	}
	
	//���ݿ�ʼʱ�� ���뵱ǰϵͳʱ���Ƿ񳬹�24Сʱ
	public  static boolean ifOver24Hour(String startDate){
		 boolean flag = false;
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d HH:mm:ss");
		 long regiterTime = 0L;
		 try {
			regiterTime = sdf.parse(startDate).getTime();
		 } catch (ParseException e) {
			e.printStackTrace();
		 }
		 long currentTime = System.currentTimeMillis();
		 //ʱ���
		 long cha = currentTime - regiterTime;
		 double result = cha * 1.0 / (1000 * 60 * 60);
         if(result > 24){
        	 flag = true;
         }
         return flag;
	}
}
