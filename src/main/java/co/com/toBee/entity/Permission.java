package co.com.toBee.entity;

import jakarta.persistence.OneToOne;

public class Permission {
	
	private Integer IdPermission;
	private String namePermission;
		
	@OneToOne
	private Role role;
	
	@OneToOne
	private MenuItem menuItem;

	public Permission() {
		
	}

	public Permission(Integer idPermission, String namePermission, Role role, MenuItem menuItem) {
		super();
		IdPermission = idPermission;
		this.namePermission = namePermission;
		this.role = role;
		this.menuItem = menuItem;
	}

	public Integer getIdPermission() {
		return IdPermission;
	}

	public void setIdPermission(Integer idPermission) {
		IdPermission = idPermission;
	}

	public String getNamePermission() {
		return namePermission;
	}

	public void setNamePermission(String namePermission) {
		this.namePermission = namePermission;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public MenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

	@Override
	public String toString() {
		return "Permission [IdPermission=" + IdPermission + ", namePermission=" + namePermission + ", role=" + role
				+ ", menuItem=" + menuItem + "]";
	}
	
	
}
