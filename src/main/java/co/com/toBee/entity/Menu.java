package co.com.toBee.entity;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Menu {
	
	private Integer IdMenu;
	private String labelMenu;
	private String urlMenu;
	
	@OneToOne
	private Role role;
	
	@OneToMany
	private MenuItem menuItem;

	public Menu() {
		
	}

	public Menu(Integer idMenu, String labelMenu, String urlMenu, Role role, MenuItem menuItem) {
		super();
		IdMenu = idMenu;
		this.labelMenu = labelMenu;
		this.urlMenu = urlMenu;
		this.role = role;
		this.menuItem = menuItem;
	}

	public Integer getIdMenu() {
		return IdMenu;
	}

	public void setIdMenu(Integer idMenu) {
		IdMenu = idMenu;
	}

	public String getLabelMenu() {
		return labelMenu;
	}

	public void setLabelMenu(String labelMenu) {
		this.labelMenu = labelMenu;
	}

	public String getUrlMenu() {
		return urlMenu;
	}

	public void setUrlMenu(String urlMenu) {
		this.urlMenu = urlMenu;
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
		return "Menu [IdMenu=" + IdMenu + ", labelMenu=" + labelMenu + ", urlMenu=" + urlMenu + ", role=" + role
				+ ", menuItem=" + menuItem + "]";
	}
	
}
