package co.com.toBee.entity;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class MenuItem {
	
	private Integer IdMenuItem;
	private String labelMenuItem;
	private String urlMenuItem;
	
	@OneToOne
	private Menu menu;
	
	@OneToMany
	private Permission permission;

	public MenuItem() {
		
	}

	public MenuItem(Integer idMenuItem, String labelMenuItem, String urlMenuItem, Menu menu, Permission permission) {
		super();
		IdMenuItem = idMenuItem;
		this.labelMenuItem = labelMenuItem;
		this.urlMenuItem = urlMenuItem;
		this.menu = menu;
		this.permission = permission;
	}

	public Integer getIdMenuItem() {
		return IdMenuItem;
	}

	public void setIdMenuItem(Integer idMenuItem) {
		IdMenuItem = idMenuItem;
	}

	public String getLabelMenuItem() {
		return labelMenuItem;
	}

	public void setLabelMenuItem(String labelMenuItem) {
		this.labelMenuItem = labelMenuItem;
	}

	public String getUrlMenuItem() {
		return urlMenuItem;
	}

	public void setUrlMenuItem(String urlMenuItem) {
		this.urlMenuItem = urlMenuItem;
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
		return "MenuItem [IdMenuItem=" + IdMenuItem + ", labelMenuItem=" + labelMenuItem + ", urlMenuItem="
				+ urlMenuItem + ", menu=" + menu + ", permission=" + permission + "]";
	}
	
}
