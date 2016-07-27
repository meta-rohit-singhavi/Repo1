package SocialNetwork;

import java.util.List;
import java.util.Scanner;

public class RecordDisplay {
	public void initialDisplay(){
		int choice= 0;
		System.out.println("Social List");
		System.out.println("1.User List \n2.Organization \n3.Exit");
		do{
			choice= getChoice();
		}while(choice < 1 || choice > 3 );
		
		if(choice == 1){
			userRecord(Entity.getUserList());
			
		}
		else if(choice == 2){
			orgRecord(Entity.getOrgList());
			
		}else{
			System.exit(0);
		}
	}
	public void userRecord(List<UserNode> userList){
		
		int choice=0;
		System.out.println("User List");
		System.out.println("-----------------");
		int counter= 1;
		for(UserNode uNode : userList){
			System.out.println(counter+"."+uNode.getName());counter++;
		}
		System.out.println(counter+".Back");
		choice= choiceValidation(Entity.getUserList().size());
		if(choice == counter){
			initialDisplay();
		}else{
			displayProfile(Entity.getUserList().get(choice-1));
		}
	}
	
	public static int choiceValidation(int size){
		int choice= 0;
		do{
			choice= getChoice();
		}while(choice < 1 || choice > size+1);
		return choice;
	}

	public void orgRecord(List<OrganizationNode> orgList){
		int counter= 1;
		int choice= 0;
		System.out.println("Organization List");
		System.out.println("-----------------");
		for(OrganizationNode orgNode : orgList){
			System.out.println(counter+"."+orgNode.getName());counter++;
		}
		System.out.println(counter+".Back");
		choice= choiceValidation(Entity.getOrgList().size());
		if(choice == counter){
			initialDisplay();
		}else{
			displayProfile(Entity.getOrgList().get(choice-1));
		}
	}
	
	public void displayProfile(Node node){
		String userOpration[]= {"Friend List","Add Friend","Check Connection","Check for Mutual Friends","back"};
		String orgOpration[]= {"Member List","Add Member"};
		int counter= 1;
		int opChoice= 0;
			System.out.println("Welcome "+node.getName()+" to your profile");
			if(node.getType().equalsIgnoreCase("user")){
				for(String op : userOpration){
					System.out.println(counter+"."+op);counter++;
				}
			do{
				opChoice= getChoice();
			}while(opChoice < 1 || opChoice >= counter);
			Connection userOp= new Connection();
			switch(opChoice){
			case 1: userOp.getConnectionList(node); break;
			case 2: userOp.addConnection(node); break;
			case 3: userOp.checkConnection(node); break;
			case 4: userOp.mutualConnection(node); break;
			case 5: userRecord(Entity.getUserList());
			}
			}else{
				counter= 1;
				for(String op : orgOpration){
					System.out.println(counter+"."+op);counter++;
				}
				
				do{
					opChoice= getChoice();
				}while(opChoice < 1 || opChoice >= counter);
				Connection orgOp= new Connection();
				switch(opChoice){
				case 1: orgOp.getConnectionList(node); break;
				case 2: orgOp.addConnection(node); break;
				case 3: orgRecord(Entity.getOrgList());
				}
			}
	}
	
	public static int getChoice(){
		Scanner scan= new Scanner(System.in);
		int choice= 0;
		System.out.print("Enter your choice:");
		try{
			choice= Integer.parseInt(scan.next());
		}
		catch(Exception e){
			System.out.println("Enter correct choice");
			getChoice();
		}
		return choice;
	}
}
