package com.sfdc.contingency.sfdc.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sfdc.contingency.sfdc.entity.Contact;
@Repository
public interface ContactDAO extends JpaRepository<Contact,Long>{	
	
	List<Contact> findById(String id);

	List<Contact> findByFirstNameAndLastName(String firstName, String lastName);

	List<Contact> findByMemberIDC(String memberIDC);

	List<Contact> findByFirstName(String firstName);

	List<Contact> findByLastName(String lastName);
	
}
