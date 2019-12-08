/**
 * 
 */
package com.sfdc.contingency.sfdc.dto;

/**
 * @author KARA1
 *
 */
public class ApplicationConstants {
	
	public interface STATUS {
		String SUCCESS = "200";
		String FAIL = "-1";
	}
	
	
	public interface ERRORCODE {
		String TECHERROR="ERR01";	
		String NOUSER="ERR02";	
	}
	
	public interface ERRORDESCRIPTION {
		String TECHERROR_DESCRIPTION="Technical Error!! Please try later";
		String NOUSER_DESCRIPTION="No User Found!!";
	
	}
	
	public interface RESPONSE {
		String RESPONSE="response";
		
	}
}
