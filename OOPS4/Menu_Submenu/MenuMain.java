package Menu_Submenu;

import java.util.Scanner;

public class MenuMain {

	public static void main(String[] args) {

		//Initializing menus and submenus
		MenuAction menuActionLst= new ActionPerform().getInput();		
		menuActionLst.displyMenu();
		menuActionLst.displaySubMenu(menuActionLst.getChoice(menuActionLst.getList().size()));
		
	}

}
