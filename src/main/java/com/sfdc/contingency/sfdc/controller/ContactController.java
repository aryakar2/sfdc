package com.sfdc.contingency.sfdc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfdc.contingency.sfdc.dto.ApplicationConstants;
import com.sfdc.contingency.sfdc.dto.ContactDTO;
import com.sfdc.contingency.sfdc.dto.Message;
import com.sfdc.contingency.sfdc.dto.Status;
import com.sfdc.contingency.sfdc.entity.Contact;
import com.sfdc.contingency.sfdc.service.ContactService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	
	@RequestMapping(path ="/getContactById/{id}")
	public Map<String,Object> getContactListById(@PathVariable("id") String id){
		log.info("Hi !! I am in controller getContactListById !!");
		Map<String,Object> map = new HashMap<String,Object>();
		List<Contact> contactList = new ArrayList<Contact>();
		try {
			contactList=contactService.getContactById(id);
		}catch(Exception e) {
			Status status = new Status();
			status.setCode(ApplicationConstants.STATUS.FAIL);
			status.setMessages(errorBuilder(ApplicationConstants.ERRORCODE.TECHERROR));	
			map.put(ApplicationConstants.RESPONSE.RESPONSE, status);			
		}	
		if(contactList.size() ==0)
		{			
			Status status = new Status();
			status.setCode(ApplicationConstants.STATUS.FAIL);
			status.setMessages(errorBuilder(ApplicationConstants.ERRORCODE.NOUSER));			
			map.put(ApplicationConstants.RESPONSE.RESPONSE, status);
		}
		else
		{			
			map.put(ApplicationConstants.RESPONSE.RESPONSE, contactList);
		}
		return map;
	}
	
	@RequestMapping(path ="/getContactByMemberIDC/{memberIDC}")
	public Map<String,Object> getContactListByMemberIDC(@PathVariable("memberIDC") String memberIDC){
		log.info("Hi !! I am in controller getContactByMemberIDC!!");
		Map<String,Object> map = new HashMap<String,Object>();
		List<Contact> contactList = new ArrayList<Contact>();
		try {
			contactList=contactService.getContactByMemberId(memberIDC);
		}catch(Exception e) {
			Status status = new Status();
			status.setCode(ApplicationConstants.STATUS.FAIL);
			status.setMessages(errorBuilder(ApplicationConstants.ERRORCODE.TECHERROR));	
			map.put(ApplicationConstants.RESPONSE.RESPONSE, status);			
		}	
		if(contactList.size() ==0)
		{			
			Status status = new Status();
			status.setCode(ApplicationConstants.STATUS.FAIL);
			status.setMessages(errorBuilder(ApplicationConstants.ERRORCODE.NOUSER));			
			map.put(ApplicationConstants.RESPONSE.RESPONSE, status);
		}
		else
		{			
			map.put(ApplicationConstants.RESPONSE.RESPONSE, contactList);
		}
		
		return map;		
		
	}
	
	@RequestMapping(path ="/getContactByFirstNameAndLastName/{fName}/{lName}")
	public Map<String,Object> getContactByFirstNameAndLastName(@PathVariable("fName") String fName,@PathVariable("lName") String lName){
		log.info("Hi !! I am in getContactByFirstNameAndLastName controller");
		Map<String,Object> map = new HashMap<String,Object>();
		List<ContactDTO> contactList = new ArrayList<ContactDTO>();
		try {
			contactList=contactService.getContactByName(fName,lName);			
		}catch(Exception e) {			
			log.info("Hi !! I am in getContactByFirstNameAndLastName controller exception");
			e.printStackTrace();
			Status status = new Status();
			status.setCode(ApplicationConstants.STATUS.FAIL);
			status.setMessages(errorBuilder(ApplicationConstants.ERRORCODE.TECHERROR));	
			map.put(ApplicationConstants.RESPONSE.RESPONSE, status);			
		}		
		if(contactList.size() ==0)
		{			
			Status status = new Status();
			status.setCode(ApplicationConstants.STATUS.FAIL);
			status.setMessages(errorBuilder(ApplicationConstants.ERRORCODE.NOUSER));			
			map.put(ApplicationConstants.RESPONSE.RESPONSE, status);
		}
		else
		{
			//Success
			map.put(ApplicationConstants.RESPONSE.RESPONSE, contactList);
		}		
		return map;
	}
	
	@RequestMapping(path ="/getContactByFirstName/{fname}")
	public Map<String,Object> getContactListByFirstName(@PathVariable("fname") String firstName){
		log.info("Hi !! I am in getContactByFirstName controller");
		Map<String,Object> map = new HashMap<String,Object>();
		List<Contact> contactList = new ArrayList<Contact>();
		try {
			contactList=contactService.getContactByFirstName(firstName);
		}catch(Exception e) {
			Status status = new Status();
			status.setCode(ApplicationConstants.STATUS.FAIL);
			status.setMessages(errorBuilder(ApplicationConstants.ERRORCODE.TECHERROR));			
			map.put(ApplicationConstants.RESPONSE.RESPONSE, status);			
		}		
		if(contactList.size() ==0)
		{			
			Status status = new Status();
			status.setCode(ApplicationConstants.STATUS.FAIL);
			status.setMessages(errorBuilder(ApplicationConstants.ERRORCODE.NOUSER));			
			map.put(ApplicationConstants.RESPONSE.RESPONSE, status);
		}
		else
		{
			//Success
			map.put(ApplicationConstants.RESPONSE.RESPONSE, contactList);
		}		
		return map;
	}
	
	
	@RequestMapping(path ="/getContactByLasttName/{lname}")
	public Map<String,Object> getContactByLasttName(@PathVariable("lname") String lastName){
		log.info("Hi !! I am in getContactByLasttName controller");
		Map<String,Object> map = new HashMap<String,Object>();
		List<ContactDTO> contactList = new ArrayList<ContactDTO>();
		try {
			contactList=contactService.getContactByLastName(lastName);
		}catch(Exception e) {
			Status status = new Status();
			status.setCode(ApplicationConstants.STATUS.FAIL);
			status.setMessages(errorBuilder("Technical Error!! Please try later"));			
			map.put(ApplicationConstants.RESPONSE.RESPONSE, status);			
		}		
		if(contactList.size() ==0)
		{			
			Status status = new Status();
			status.setCode(ApplicationConstants.STATUS.FAIL);
			status.setMessages(errorBuilder(ApplicationConstants.ERRORCODE.NOUSER));			
			map.put(ApplicationConstants.RESPONSE.RESPONSE, status);
		}
		else
		{
			//Success
			map.put(ApplicationConstants.RESPONSE.RESPONSE, contactList);
		}		
		return map;
	}
	
	
	private List<Message> errorBuilder (String errorCode) {
		Message message = new Message();
		List<Message> listOfMessage = new ArrayList<Message>();
		String errorDesc = "";
			/*switch (errorCode) {
			case ApplicationConstants.ERRORCODE.NOUSER :
				errorDesc=ApplicationConstants.ERRORDESCRIPTION.NOUSER_DESCRIPTION;
			case ApplicationConstants.ERRORCODE.TECHERROR :
				errorDesc = ApplicationConstants.ERRORDESCRIPTION.TECHERROR_DESCRIPTION;
			}*/
		
		if (errorCode.equalsIgnoreCase(ApplicationConstants.ERRORCODE.NOUSER))
			errorDesc=ApplicationConstants.ERRORDESCRIPTION.NOUSER_DESCRIPTION;
		if (errorCode.equalsIgnoreCase(ApplicationConstants.ERRORCODE.TECHERROR))
			errorDesc=ApplicationConstants.ERRORDESCRIPTION.TECHERROR_DESCRIPTION;
		
		log.info("errorDesc "+errorDesc);
		message.setCode(errorCode);
		message.setDescription(errorDesc);
		message.setType(ApplicationConstants.STATUS.FAIL);
		listOfMessage.add(message);
		return listOfMessage;
	}	

}
