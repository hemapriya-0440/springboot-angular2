package net.guides.springboot2.springboot2jpacrudexample.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "employees_registration")
public class Employee {
	@Id
    @Column(name = "employee_id", nullable = false)
 	public long empId;		 	
    @Column(name = "first_name", nullable = false)
	@NotEmpty(message="should not be empty")
    @NotNull
	@NotBlank
	public String firstName;
    @Column(name = "last_Name", nullable = false)
	@NotEmpty(message="should not be empty")
    @NotNull
	@NotBlank
	public String lastName;
 	@Column(name = "mail_Id", nullable = false)
	@NotEmpty(message="should not be empty")
 	@NotNull
	@NotBlank
 	public String mailId;		 	
 	@Column(name = "mobile_No", nullable = false)
 	@NotNull
	@NotBlank
	public String mobileNo;		 	
 	@Column(name = "date_of_Birth", nullable = false)
    @JsonFormat(pattern="yyyy-MM-dd")
	public Date doB;
 	@Column(name = "project_Id", nullable = false)
 	@NotNull
	@NotBlank
	public String projectId;		 	 
 	@Column(name = "project_Name", nullable = false)
 	@NotNull
	@NotBlank
	@NotEmpty(message="should not be empty")
	public String projectName;		 	 
 	@Column(name = "reporting_Manager", nullable = false)
	@NotEmpty(message="should not be empty")
 	@NotNull
	@NotBlank
	public String repManager;		 	 
 	@Column(name = "project_Role", nullable = false)
	@NotEmpty(message="should not be empty")
 	@NotNull
	@NotBlank
	public String projRole;		 	 
 	@Column(name = "experience", nullable = false)
 	@NotNull
 	@Range(min = 1)
	public int exp;
 	@Column(name = "Address_Line1", nullable = false)
	@NotEmpty(message="should not be empty")
	public String aLine1;			
	@Column(name = "Address_Line2", nullable = false)
	@NotEmpty(message="should not be empty")
	@NotNull
	@NotBlank
	public String aLine2;			
	@Column(name = "City", nullable = false)
	@NotEmpty(message="should not be empty")
	@NotNull
	@NotBlank
	public String city;			
	@Column(name = "State", nullable = false)
	@NotEmpty(message="should not be empty")
	@NotNull
	@NotBlank
	public String state;	
	@Column(name = "Country", nullable = false)
	@NotEmpty(message="should not be empty")
	@NotNull
	@NotBlank
	public String country;	
    @Column(name = "Pin_Code", nullable = false)
    @NotNull
	@NotBlank
 	public String pinCode;
    @Column(name = "work_Location", nullable = false)
    @NotNull
	@NotBlank
	public String workLoc;			
    @Column(name = "Odc_AccReq")
    @NotNull
	@NotBlank
	public String odcAccReq;			
    @Column(name = "Desktop_Req")
    @NotNull
	@NotBlank
	public String desReq;		
    @NotNull
	@NotBlank
    @Column(name = "Seat_tag")
	public String seatTag;	
	@Column(name = "L1_Cerification", nullable = false)
	@NotEmpty(message="choose any one option")
	public String l1Cert;		    
    @Column(name = "L2_Cerification", nullable = false)
	@NotEmpty(message="choose any one option")
	public String l2Cert;
    @Column(name = "Primary_Skills", nullable = false)
	public String primSkill;		    
    @Column(name = "Secondary_Skills", nullable = false)
	@NotEmpty(message="choose any one option")
	public String secSkill;
//    @Column(name = "Resume", nullable = false)
//	//public byte[] reSume;
    
    
		public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


		public Employee(long empId, @NotEmpty(message = "should not be empty") @NotNull @NotBlank String firstName,
		@NotEmpty(message = "should not be empty") @NotNull @NotBlank String lastName,
		@NotEmpty(message = "should not be empty") @NotNull @NotBlank String mailId, @NotNull @NotBlank String mobileNo,
		@NotEmpty(message = "choose any one option") @NotNull @NotBlank @NotEmpty(message = "choose any one option") @NotNull @NotBlank Date doB, @NotNull @NotBlank String projectId,
		@NotNull @NotBlank @NotEmpty(message = "should not be empty") String projectName,
		@NotEmpty(message = "should not be empty") @NotNull @NotBlank String repManager,
		@NotEmpty(message = "should not be empty") @NotNull @NotBlank String projRole, @NotNull @Range(min = 1) int exp,
		@NotEmpty(message = "should not be empty") String aLine1,
		@NotEmpty(message = "should not be empty") @NotNull @NotBlank String aLine2,
		@NotEmpty(message = "should not be empty") @NotNull @NotBlank String city,
		@NotEmpty(message = "should not be empty") @NotNull @NotBlank String state,
		@NotEmpty(message = "should not be empty") @NotNull @NotBlank String country, @NotNull @NotBlank String pinCode,
		@NotNull @NotBlank String workLoc, @NotNull @NotBlank String odcAccReq, @NotNull @NotBlank String desReq,
		@NotNull @NotBlank String seatTag, @NotEmpty(message = "choose any one option") String l1Cert,
		@NotEmpty(message = "choose any one option") String l2Cert, String primSkill,
		@NotEmpty(message = "choose any one option") String secSkill) {
	super();
	this.empId = empId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.mailId = mailId;
	this.mobileNo = mobileNo;
	this.doB = doB;
	this.projectId = projectId;
	this.projectName = projectName;
	this.repManager = repManager;
	this.projRole = projRole;
	this.exp = exp;
	this.aLine1 = aLine1;
	this.aLine2 = aLine2;
	this.city = city;
	this.state = state;
	this.country = country;
	this.pinCode = pinCode;
	this.workLoc = workLoc;
	this.odcAccReq = odcAccReq;
	this.desReq = desReq;
	this.seatTag = seatTag;
	this.l1Cert = l1Cert;
	this.l2Cert = l2Cert;
	this.primSkill = primSkill;
	this.secSkill = secSkill;
}


		public long getEmpId() {
			return empId;
		}


		public void setEmpId(long empId) {
			this.empId = empId;
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


		public String getMailId() {
			return mailId;
		}


		public void setMailId(String mailId) {
			this.mailId = mailId;
		}


		public String getMobileNo() {
			return mobileNo;
		}


		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}


		public Date getDoB() {
			return doB;
		}


		public void setDoB(@NotEmpty(message = "choose any one option") @NotNull @NotBlank Date doB) {
			this.doB = doB;
		}


		public String getProjectId() {
			return projectId;
		}


		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}


		public String getProjectName() {
			return projectName;
		}


		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}


		public String getRepManager() {
			return repManager;
		}


		public void setRepManager(String repManager) {
			this.repManager = repManager;
		}


		public String getProjRole() {
			return projRole;
		}


		public void setProjRole(String projRole) {
			this.projRole = projRole;
		}


		public int getExp() {
			return exp;
		}


		public void setExp(int exp) {
			this.exp = exp;
		}


		public String getaLine1() {
			return aLine1;
		}


		public void setaLine1(String aLine1) {
			this.aLine1 = aLine1;
		}


		public String getaLine2() {
			return aLine2;
		}


		public void setaLine2(String aLine2) {
			this.aLine2 = aLine2;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}


		public String getCountry() {
			return country;
		}


		public void setCountry(String country) {
			this.country = country;
		}


		public String getPinCode() {
			return pinCode;
		}


		public void setPinCode(String pinCode) {
			this.pinCode = pinCode;
		}


		public String getWorkLoc() {
			return workLoc;
		}


		public void setWorkLoc(String workLoc) {
			this.workLoc = workLoc;
		}


		public String getOdcAccReq() {
			return odcAccReq;
		}


		public void setOdcAccReq(String odcAccReq) {
			this.odcAccReq = odcAccReq;
		}


		public String getDesReq() {
			return desReq;
		}


		public void setDesReq(String desReq) {
			this.desReq = desReq;
		}


		public String getSeatTag() {
			return seatTag;
		}


		public void setSeatTag(String seatTag) {
			this.seatTag = seatTag;
		}


		public String getL1Cert() {
			return l1Cert;
		}


		public void setL1Cert(String l1Cert) {
			this.l1Cert = l1Cert;
		}


		public String getL2Cert() {
			return l2Cert;
		}


		public void setL2Cert(String l2Cert) {
			this.l2Cert = l2Cert;
		}


		public String getPrimSkill() {
			return primSkill;
		}


		public void setPrimSkill(String primSkill) {
			this.primSkill = primSkill;
		}


		public String getSecSkill() {
			return secSkill;
		}


		public void setSecSkill(String secSkill) {
			this.secSkill = secSkill;
		}

}
	
	
