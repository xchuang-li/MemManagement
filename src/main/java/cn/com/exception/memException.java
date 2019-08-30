package cn.com.exception;


/**
 *会员 创建时遇到的异常
 *@author 作者:陈凯旗
 *@version 2019年8月30日上午9:53:54
 */
public class memException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	private String errorCode;//异常码

	public memException(String errorCode,String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

}
