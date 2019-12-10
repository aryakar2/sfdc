/**
 * 
 */
package com.sfdc.contingency.sfdc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sfdc.contingency.sfdc.dto.ContactDTO;
import com.sfdc.contingency.sfdc.entity.Contact;
import com.sfdc.contingency.sfdc.utils.SQLRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author KARA1
 *
 */
@Slf4j
@Repository
public class ContactDAOImpl implements ContactDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
	    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Contact> findById(String id) {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ContactDTO> findByFirstNameAndLastName(String firstName, String lastName) throws Exception{
		// TODO Auto-generated method stub
		Boolean validZip = false;
        
        String query = SQLRepository.GET_CONTACT_BY_FIRST_NAME_AND_LAST_NAME;
        List<ContactDTO> listcontactDTO = new ArrayList<ContactDTO>();
		
		 firstName="%"+firstName+"%"; 
		 lastName="%"+lastName+"%";;
		
        log.info("firstName "+firstName);
        log.info("lastName "+lastName);
        
        try{        	
        	listcontactDTO =(List<ContactDTO>) jdbcTemplate.queryForObject(query, new Object[] { firstName,lastName },
                    new RowMapper() {
                        public List<ContactDTO> mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                            List<ContactDTO> tempList = new ArrayList<ContactDTO>(); 
                            log.info("size is"+tempList.size()); 
                        	while(resultSet.next())
                             {
                        		ContactDTO tempDTO = new ContactDTO();
                        		tempDTO.setId(resultSet.getString(1));
                        		tempDTO.setMemberIDc(resultSet.getString(2));
                        		tempDTO.setFirstName(resultSet.getString(3));
                        		tempDTO.setLastName(resultSet.getString(4));
                        		tempDTO.setPhone(resultSet.getString(5));
                        		tempDTO.setMobilePhone(resultSet.getString(6));
                        		tempDTO.setOtherPhone(resultSet.getString(7));
                        		tempDTO.setEmail(resultSet.getString(8));
                        		tempDTO.setBirthDate(resultSet.getString(9));
                        		tempDTO.setFax(resultSet.getString(10));
                        		tempList.add(tempDTO);
                        		log.info(" tempDTO "+tempDTO.toString());
                             }    
                        	 return tempList;
                        }                       
                    }
        	); 
              
         } catch (Exception erdao) {
        	 erdao.printStackTrace();
        	 log.info ("did not find contact in the database. Return false");
         }
        return listcontactDTO;
	}

	@Override
	public List<Contact> findByMemberIDC(String memberIDC) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ContactDTO> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}}
