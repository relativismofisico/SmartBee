package co.com.toBee.entity;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Role {
	
	private Integer IdRole;
	private String nameRole;
	private String descriptionRole;
	
	@ManyToOne
	private User user;
	
	@OneToMany
	private Menu menu;
	
	@OneToMany
	private Permission permission;

	public Role() {
	}

	public Role(Integer idRole, String nameRole, String descriptionRole, User user, Menu menu, Permission permission) {
		super();
		IdRole = idRole;
		this.nameRole = nameRole;
		this.descriptionRole = descriptionRole;
		this.user = user;
		this.menu = menu;
		this.permission = permission;
	}

	public Integer getIdRole() {
		return IdRole;
	}

	public void setIdRole(Integer idRole) {
		IdRole = idRole;
	}

	public String getNameRole() {
		return nameRole;
	}

	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}

	public String getDescriptionRole() {
		return descriptionRole;
	}

	public void setDescriptionRole(String descriptionRole) {
		this.descriptionRole = descriptionRole;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	@Override
	public String toString() {
		return "Role [IdRole=" + IdRole + ", nameRole=" + nameRole + ", descriptionRole=" + descriptionRole + ", user="
				+ user + ", menu=" + menu + ", permission=" + permission + "]";
	}
	
	
	
	

}
