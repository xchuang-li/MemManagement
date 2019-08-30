package cn.com.until;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

import cn.com.constant.MemConstant;

/**
 *@describe 会员工具类
 *@author 作者:陈凯旗
 *@version 2019年8月29日下午6:30:13
 */
public class MemUntil {
	
	private static Random random = new Random();
	
	
	//检查年龄是否超过18岁
	public static boolean checkAge(int custAge){
		if(custAge >= MemConstant.MAN_AGE_MIN){
			return true;
		}else{
			return false;
		}
	}
	
	//获取乘数位
	public static double getChengShu(int randomSize,int count){
		return Math.pow(10.0, count-randomSize);
	}
	
	//随机生产7位数  普通会员和金卡会员
	public static String genernateSevenNum(){
		int randomNum = random.nextInt(10000000);
		String randomNumStr = String.valueOf(randomNum);
		randomNum *= getChengShu(randomNumStr.length(),MemConstant.MEM_KA_NOPRE_LENGTH);
		return String.valueOf(randomNum);
	}
	
	//钻石卡和金卡  随机生产5位数字（不包括前缀后缀和吉利数字的数字）  且保证 不能连续4和7
	public static String genernateFiveNum(){
		//四重复取代数
		char[] replace7Array = new char[]{'0','1','2','3','4','5','6','8','9'};
		//七重复取代数组
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
	
	//根据会员类型创建卡号
	public static String  produceCardNo(String memType){
		//吉利数组
		int[] luckyArray = new int[]{6,8,9};
		//后缀尾数取数
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
		System.out.println("生成会员卡号："+sb);
		return sb.toString();
	}
	
	//根据开始时间 求与当前系统时间是否超过24小时
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
		 //时间差
		 long cha = currentTime - regiterTime;
		 double result = cha * 1.0 / (1000 * 60 * 60);
         if(result > 24){
        	 flag = true;
         }
         return flag;
	}
}
