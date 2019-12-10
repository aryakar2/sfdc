/**
 * 
 */
package com.sfdc.contingency.sfdc.utils;

/**
 * @author KARA1
 *
 */
public class SQLRepository {
	
	
	/**
	 * Get Contact By First Name & Last Name.
	 */
	public static final String GET_CONTACT_BY_FIRST_NAME_AND_LAST_NAME = "SELECT Id,MemberID__c,FirstName,LastName,Phone,MobilePhone,OtherPhone,Email,BirthDate,Fax FROM Contact WHERE FirstName LIKE ? and LastName LIKE ?";

}
