package SocialNetwork;

import java.util.LinkedList;
import java.util.List;

/**
 * This class will perform several connection-operations
 */
public class Connection {
	
	/**
	 * It will print all connections of specific node
	 * @param node
	 */
	public void getConnectionList(Node node){
		if(node.getList().size() != 0){
			for(UserNode uNode : node.getList()){
				System.out.println(uNode.getName());
				
			}
			new RecordDisplay().displayProfile(node);
		}else{
			System.out.println("You Dont Have Any Connection Yet");
			System.out.println();
			new RecordDisplay().displayProfile(node);
		}
	}
	
	/**
	 * This method will add a new connection 
	 * to the connection list of the node
	 * @param node
	 */
	public void  addConnection(Node node){
		
		List<UserNode> strangerList= getStrangersList(node);
		int counter= 0, choice= 0;
		for(UserNode strangerNode : strangerList){
			System.out.println(++counter+"."+strangerNode.getName());
		}
		System.out.println(++counter+".Back");
		do{
			System.out.println("select a Connection to add or go back.");
			choice= RecordDisplay.getChoice();
		}while(choice < 1 || choice > strangerList.size()+1);
		
		if(choice == counter){
			System.out.println();
			new RecordDisplay().displayProfile(node);
		}else{
			node.getList().add(strangerList.get(choice-1));
			strangerList.get(choice-1).getList().add((UserNode)node);
			addConnection(node);
		}
	}
	
	/**
	 * This will find the user list 
	 * which are not friends of passed node
	 * @param node
	 * @return It will return stranger users list
	 */
	public List<UserNode> getStrangersList( Node node){
		List<UserNode> uList= Entity.getUserList();
		List<UserNode> frndList= node.getList();
		List<UserNode> strangersList= new LinkedList<UserNode>();
		
		if(frndList.size() == 0){
			for(UserNode uNode: uList){
			if(uNode.hashCode() != node.hashCode()){
					strangersList.add(uNode);
				}
			}
		}else{
			for(UserNode uNode : uList){
				if(uNode.hashCode() != node.hashCode()){
					if(!frndList.contains(uNode)){
						strangersList.add(uNode);
					}
				}
			}
		}
			return strangersList;
	}
	
	
	public void  mutualConnection(Node node){
		List<UserNode> myFrndList= node.getList();
		int counter= 0, choice= 0;
		for(UserNode fNode : myFrndList){
			System.out.println(++counter+"."+fNode.getName());
		}
		System.out.println(++counter+".Back");
		do{
			System.out.println("");
			choice=RecordDisplay.getChoice();
		}while(choice < 1 || choice > counter);
		if(choice == counter){
			new RecordDisplay().displayProfile(node);
		}else{
			UserNode frndNode = node.getList().get(choice-1);
			List<UserNode> frndList = frndNode.getList();
			for(UserNode myNode : myFrndList){
				if(frndList.contains(myNode)){
					System.out.println("Your Mutual connection is :: "+myNode.getName());
				}
			}
			System.out.println();
			new RecordDisplay().displayProfile(node);
		}	
	}

	/**
	 * It will print the connection path between two nodes
	 * @param node
	 */
	public void checkConnection(Node node){
		int counter= 0, choice= 0;
		Graph graph= new Graph();
		//String connectionPath= ""+node.getName();
		UserNode destNode;
		List<UserNode> strangerList= getStrangersList(node);

		if(strangerList.size() != 0){
			for(UserNode strangeNode : strangerList){
				System.out.println(++counter+"."+strangeNode.getName());
			}
			System.out.println(++counter+".Back");
		}else{
			System.out.println("You Dont Have Any Strangers");
			System.out.println();
			new RecordDisplay().displayProfile(node);
		}

		do{
			System.out.println("Select any one to check connection path");
			choice=RecordDisplay.getChoice();
		}while(choice < 1 || choice > counter);

		destNode= strangerList.get(choice-1);
		
		System.out.println("Connection Path= "+graph.getConnectionPath((UserNode)node,destNode));
		
		new RecordDisplay().initialDisplay();
	}
	
}
