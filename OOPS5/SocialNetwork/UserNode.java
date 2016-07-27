package SocialNetwork;

import java.util.LinkedList;
import java.util.List;

public class UserNode extends Node{
	String userName;
	int userID;
	List<UserNode> frndList;
	
	UserNode(){
		frndList=new LinkedList<UserNode>();
	}
	@Override
	void setName(String name){
		userName=name;
	}
	
	@Override
	void setList(UserNode userObj){
		frndList.add(userObj);
	}
	
	@Override
	List<UserNode> getList(){
		return frndList;
	}
	
	@Override
	String getName() {
		return userName;
	}
	
	@Override
	void setUserID(int id){
		userID=id;
	}
	
	
	public int hashCode(){
		return userID;
	}
	
	String getType(){
		return "user";
	}

}
