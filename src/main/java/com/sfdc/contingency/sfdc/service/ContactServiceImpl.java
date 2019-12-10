/**
 * 
 */
package com.sfdc.contingency.sfdc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sfdc.contingency.sfdc.dao.ContactDAO;
import com.sfdc.contingency.sfdc.dto.ContactDTO;
import com.sfdc.contingency.sfdc.entity.Contact;

import lombok.extern.slf4j.Slf4j;

/**
 * @author KARA1
 *
 */
@Slf4j
@Service
public class ContactServiceImpl implements ContactService{

	
	@Autowired
	private ContactDAO contactDao;
	
	@Override
	public List<Contact> getContactById(String id) {
		// TODO Auto-generated method stub
		return contactDao.findById(id);
	}

	@Override
	public List<Contact> getContactByMemberId(String memberIDC) {
		// TODO Auto-generated method stub
		return contactDao.findByMemberIDC(memberIDC);
	}
	

	@Override
	public List<ContactDTO> getContactByName(String firstName,String lastName) throws Exception{
		// TODO Auto-generated method stub				
		log.info("firstName "+ firstName);
		log.info("lastName "+ lastName);
		return contactDao.findByFirstNameAndLastName(firstName,lastName);		
	}

	@Override
	public List<Contact> getContactByFirstName(String firstName) throws Exception{
		// TODO Auto-generated method stub
		return contactDao.findByFirstName(firstName);
	}

	@Override
	public List<ContactDTO> getContactByLastName(String lastName) throws Exception{
		// TODO Auto-generated method stub
		return contactDao.findByLastName(lastName);
	}

}
