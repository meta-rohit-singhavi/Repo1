package Menu_Submenu;

import java.util.ArrayList;
import java.util.List;

/**
 * It will set menu items and their submenu items as well
 */
public class Menu {
	String menuName;
	List<SubMenu> subMenu;

	public Menu(String name){
		menuName= name;
		subMenu= new ArrayList<SubMenu>();
	}
	
	public void setSubMenu(SubMenu sbMenu){
		subMenu.add(sbMenu);
	}
	
	public List<SubMenu> getSubMenu(){
		return subMenu;
	}
	public String getMenuName(){
		return menuName;
	}

}
