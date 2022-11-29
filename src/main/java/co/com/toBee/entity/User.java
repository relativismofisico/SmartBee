package co.com.toBee.entity;

import java.util.Date;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class User {
	
	private Integer idUser;
	private String nameUser;
	private String lastNameUser;
	private String userNameUser;
	private String emailUser;
	private String addressUser;
	private String cellPhoneUser;
	private String passwordUser;
	private Date creationDateUSer;
	
	@OneToOne
	private Company company;
	
	@OneToMany
	private String role;

	public User() {
	}

	public User(Integer idUser, String nameUser, String lastNameUser, String userNameUser, String emailUser,
			String addressUser, String cellPhoneUser, String passwordUser, Date creationDateUSer, Company company,
			String role) {
		super();
		this.idUser = idUser;
		this.nameUser = nameUser;
		this.lastNameUser = lastNameUser;
		this.userNameUser = userNameUser;
		this.emailUser = emailUser;
		this.addressUser = addressUser;
		this.cellPhoneUser = cellPhoneUser;
		this.passwordUser = passwordUser;
		this.creationDateUSer = creationDateUSer;
		this.company = company;
		this.role = role;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getLastNameUser() {
		return lastNameUser;
	}

	public void setLastNameUser(String lastNameUser) {
		this.lastNameUser = lastNameUser;
	}

	public String getUserNameUser() {
		return userNameUser;
	}

	public void setUserNameUser(String userNameUser) {
		this.userNameUser = userNameUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getAddressUser() {
		return addressUser;
	}

	public void setAddressUser(String addressUser) {
		this.addressUser = addressUser;
	}

	public String getCellPhoneUser() {
		return cellPhoneUser;
	}

	public void setCellPhoneUser(String cellPhoneUser) {
		this.cellPhoneUser = cellPhoneUser;
	}

	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public Date getCreationDateUSer() {
		return creationDateUSer;
	}

	public void setCreationDateUSer(Date creationDateUSer) {
		this.creationDateUSer = creationDateUSer;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nameUser=" + nameUser + ", lastNameUser=" + lastNameUser
				+ ", userNameUser=" + userNameUser + ", emailUser=" + emailUser + ", addressUser=" + addressUser
				+ ", cellPhoneUser=" + cellPhoneUser + ", passwordUser=" + passwordUser + ", creationDateUSer="
				+ creationDateUSer + ", company=" + company + ", role=" + role + "]";
	}
	
	
}
