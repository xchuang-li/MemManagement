package cn.com.exception;


/**
 *��Ա ����ʱ�������쳣
 *@author ����:�¿���
 *@version 2019��8��30������9:53:54
 */
public class memException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	private String errorCode;//�쳣��

	public memException(String errorCode,String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

}
