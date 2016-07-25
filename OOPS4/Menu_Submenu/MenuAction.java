package Menu_Submenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * This class will take actions on menu according to user input
 *
 */
public class MenuAction {
	List<Menu> menuLst;
	MenuAction(){
		menuLst= new ArrayList<Menu>();
	}
	
	public void addMenu(Menu menuObj){
		menuLst.add(menuObj);
	}
	
	/**
	 * It will display main menu items
	 */
	public void displyMenu(){
		int counter= 1;
		System.out.println("Menu List");
		for(Menu menu : menuLst){			
			System.out.println(""+counter+"."+menu.getMenuName());
			counter++;
		}
		System.out.println(counter+".Exit");
	}
	
	public int getChoice(int size){
		Scanner scan= new Scanner(System.in);
		int choice= 0;
		
			do{
				System.out.println("Enter Your choice");
				try{
					choice= Integer.parseInt(scan.next());
				}
				catch(Exception e){
					System.out.println("Enter valid choice");
				}
				if(choice<1 || choice > size+1){
					System.out.println("Invalid choice");
				}
			}while(choice < 1 || choice > size+1);
		
		return choice;
	}
	
	/**
	 * This method will display the sub menus
	 * @param choice 
	 */
	public void displaySubMenu(int choice){
		if(choice == getList().size()+1){
			System.exit(0);
		}
		List<SubMenu> lst= menuLst.get(choice-1).getSubMenu();
		int counter= 1;
		System.out.println("Menu List");
		for(SubMenu sMenu : lst){
			System.out.println(""+counter+"."+sMenu.getSubMenuName());counter++;
		}
		System.out.println(counter+".Back");
		choice= getChoice(lst.size());
		
		if(choice == counter){
			displyMenu();
			displaySubMenu(getChoice(getList().size()));
		}else{
			System.out.println("You Selected "+lst.get(choice-1).getSubMenuName());
		}
		
	}
	
	public List<Menu> getList(){
		return menuLst;
	}
}
