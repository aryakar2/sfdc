package com.sfdc.contingency.sfdc.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sfdc.contingency.sfdc.dto.ContactDTO;
import com.sfdc.contingency.sfdc.entity.Contact;
@Repository
public interface ContactDAO{	
	
	List<Contact> findById(String id);

	List<ContactDTO> findByFirstNameAndLastName(String firstName, String lastName) throws Exception;

	List<Contact> findByMemberIDC(String memberIDC);

	List<Contact> findByFirstName(String firstName);

	List<ContactDTO> findByLastName(String lastName);
	
}
