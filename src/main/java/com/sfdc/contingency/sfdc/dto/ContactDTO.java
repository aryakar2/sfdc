package com.sfdc.contingency.sfdc.dto;

public class ContactDTO {
	
	
	private String Id;
	
	private String MemberIDc;
	
	private String firstName;
	
	private String lastName;
	
	private String phone;
	
	private String mobilePhone;
	
	private String otherPhone;
	
	private String email;
	
	private String birthDate;
	
	private String fax;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getMemberIDc() {
		return MemberIDc;
	}

	public void setMemberIDc(String memberIDc) {
		MemberIDc = memberIDc;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getOtherPhone() {
		return otherPhone;
	}

	public void setOtherPhone(String otherPhone) {
		this.otherPhone = otherPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("ContactDTO");
		sb.append("{Id='").append(Id).append('\'');
		sb.append(", MemberID__c=").append(MemberIDc);
		sb.append(", FirstName=").append(firstName);
		sb.append(", LastName=").append(lastName);
		sb.append(", Phone =").append(phone);
		sb.append(", MobilePhone=").append(mobilePhone);
		sb.append(", OtherPhone=").append(otherPhone);
		sb.append(", Email=").append(email);
		sb.append(", BirthDate=").append(birthDate);
		sb.append(", Fax=").append(fax);
		sb.append('}');
		return sb.toString();
	}

}
