package co.com.toBee.entity;

import java.util.Date;

import jakarta.persistence.OneToMany;

public class Company {
	
	private String nit;
	private String nameCompany;
	private String addressCompany;
	private String phoneNumberCompany;
	private String countryCompany;
	private Date creationDateCompany;
	
	@OneToMany
	private User user;

		
	public Company() {
	}
	
	public Company(String nit, String nameCompany, String addressCompany, String phoneNumberCompany,
			String countryCompany, Date creationDateCompany, User user) {
		super();
		this.nit = nit;
		this.nameCompany = nameCompany;
		this.addressCompany = addressCompany;
		this.phoneNumberCompany = phoneNumberCompany;
		this.countryCompany = countryCompany;
		this.creationDateCompany = creationDateCompany;
		this.user = user;
	}


	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public String getAddressCompany() {
		return addressCompany;
	}

	public void setAddressCompany(String addressCompany) {
		this.addressCompany = addressCompany;
	}

	public String getPhoneNumberCompany() {
		return phoneNumberCompany;
	}

	public void setPhoneNumberCompany(String phoneNumberCompany) {
		this.phoneNumberCompany = phoneNumberCompany;
	}

	public String getCountryCompany() {
		return countryCompany;
	}

	public void setCountryCompany(String countryCompany) {
		this.countryCompany = countryCompany;
	}

	public Date getCreationDateCompany() {
		return creationDateCompany;
	}

	public void setCreationDateCompany(Date creationDateCompany) {
		this.creationDateCompany = creationDateCompany;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Company [nit=" + nit + ", nameCompany=" + nameCompany + ", addressCompany=" + addressCompany
				+ ", phoneNumberCompany=" + phoneNumberCompany + ", countryCompany=" + countryCompany
				+ ", creationDateCompany=" + creationDateCompany + ", user=" + user + "]";
	}
	
}
