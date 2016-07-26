package Menu_Submenu;

import java.util.Scanner;

public class ActionPerform {
	
public static MenuAction getInput(){
		MenuAction menuActionLst= new MenuAction();
		
		boolean repeat=false;
		do{
		repeat=false;
		
		System.out.println("Enter Menu Name");	//for initialize menu
		Scanner scan=new Scanner(System.in);
		String menuName=scan.next();
		Menu menu=new Menu(menuName);
		
		System.out.println("Enter number of sublist");		//for initialize submenu
		int size = 0;
		try{
		size=Integer.parseInt(scan.next());
		if(size<0){
			getInput();
		}
		}catch(Exception e){
			System.out.println("Invalid no");
			getInput();
		}
		for(int index=0;index<size;index++){
			System.out.print("Enter sublist "+(index+1));
			String subMenu=scan.next();
			menu.setSubMenu(new SubMenu(subMenu));
		}
		
		menuActionLst.addMenu(menu);		//adding menu in menuAction
		System.out.println("Do YOU want to Enter new Menu---Y and--N");
		String choice=scan.next();
		if(choice.equalsIgnoreCase("y")){
			repeat=true;
		}
		}while(repeat);
		return menuActionLst;
	}
	
}
