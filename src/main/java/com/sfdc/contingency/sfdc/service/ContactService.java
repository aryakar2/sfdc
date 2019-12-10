/**
 * 
 */
package com.sfdc.contingency.sfdc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sfdc.contingency.sfdc.dto.ContactDTO;
import com.sfdc.contingency.sfdc.entity.Contact;

/**
 * @author KARA1
 *
 */
@Service
public interface ContactService {
	
	List<Contact> getContactById(String id);
	
	List<Contact> getContactByMemberId(String memberIDC);
	
	List<ContactDTO> getContactByName(String firstName,String lastName) throws Exception;

	List<Contact> getContactByFirstName(String firstName) throws Exception;

	List<ContactDTO> getContactByLastName(String lastName) throws Exception;

}
