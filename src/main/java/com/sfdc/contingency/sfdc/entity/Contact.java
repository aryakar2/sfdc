package com.sfdc.contingency.sfdc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Contact")
@Getter
@Setter
public class Contact {	
	
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy =GenerationType.AUTO)
	private String id;	
	
	@Column (name ="memberID_C")
	private String memberIDC;
	
	@Column (name ="first_name")
	private String firstName;
		
	@Column (name ="last_name")
	private String lastName;
	
	@Column (name ="phone")
	private String phone;
	
	@Column (name ="mobilePhone")
	private String mobilePhone;
	
	@Column (name ="otherPhone")
	private String otherPhone;
	
	@Column (name ="email")
	private String email;

}
