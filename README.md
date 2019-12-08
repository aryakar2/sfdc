# sfdc

SpringBoot app to fetch Contact Details using Name , Member ID.


1. GetContactByFirstAndLastName
/springbootappsfdc/getContactByFirstNameAndLastName/<firstName>/<latName>

2.  GetContactByFirstName
/springbootappsfdc/getContactByFirstName/<firstName>


3. GetContactByLastName
/springbootappsfdc/getContactByLasttName/<lastNme>

4. GetContactId
/springbootappsfdc/getContactById/<id>

5. GetContactByMemberIDC
/springbootappsfdc/getContactByMemberIDC/<memberidc>
  
  DB structure
  +--------------+--------------+------+-----+---------+-------+
| Field        | Type         | Null | Key | Default | Extra |
+--------------+--------------+------+-----+---------+-------+
| id           | varchar(50)  | YES  |     | NULL    |       |
| memberID_C   | varchar(50)  | YES  |     | NULL    |       |
| first_name   | varchar(50)  | YES  |     | NULL    |       |
| last_name    | varchar(50)  | YES  |     | NULL    |       |
| phone        | varchar(50)  | YES  |     | NULL    |       |
| mobilePhone  | varchar(50)  | YES  |     | NULL    |       |
| otherPhone   | varchar(50)  | YES  |     | NULL    |       |
| email        | varchar(50)  | YES  |     | NULL    |       |
| mobile_phone | varchar(255) | YES  |     | NULL    |       |
| other_phone  | varchar(255) | YES  |     | NULL    |       |
+--------------+--------------+------+-----+---------+-------+
