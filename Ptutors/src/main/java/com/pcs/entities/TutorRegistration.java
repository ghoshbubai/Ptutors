package com.pcs.entities;
// Generated Oct 25, 2018 5:38:49 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TutorRegistration generated by hbm2java
 */
@Entity
@Table(name = "tutor_registration", catalog = "ptutors_dbs")
public class TutorRegistration implements java.io.Serializable {

	private Integer tutorId;
	private String email;
	private String password;
	private String name;
	private String gender;
	private String dob;
	private String address1;
	private String address2;
	private String address3;
	private String country;
	private String state;
	private Long pincode;
	private long contactNo;

	public TutorRegistration() {
	}

	public TutorRegistration(String email, String password, String dob, String address1, long contactNo) {
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.address1 = address1;
		this.contactNo = contactNo;
	}

	public TutorRegistration(String email, String password, String name, String gender, String dob, String address1,
			String address2, String address3, String country, String state, Long pincode, long contactNo) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.country = country;
		this.state = state;
		this.pincode = pincode;
		this.contactNo = contactNo;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "tutor_id", unique = true, nullable = false)
	public Integer getTutorId() {
		return this.tutorId;
	}

	public void setTutorId(Integer tutorId) {
		this.tutorId = tutorId;
	}

	@Column(name = "email", nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "gender", length = 20)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "dob", nullable = false, length = 45)
	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Column(name = "address1", nullable = false, length = 200)
	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@Column(name = "address2", length = 200)
	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Column(name = "address3", length = 200)
	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	@Column(name = "country", length = 45)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "state", length = 50)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "pincode")
	public Long getPincode() {
		return this.pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	@Column(name = "contact_no", nullable = false)
	public long getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

}
