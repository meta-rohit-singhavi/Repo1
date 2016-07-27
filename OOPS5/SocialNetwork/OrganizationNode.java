package SocialNetwork;

import java.util.LinkedList;
import java.util.List;

public class OrganizationNode extends Node{
	String orgName;
	List<UserNode> likeList;
	int orgID;
	
	OrganizationNode(){
		likeList= new LinkedList<UserNode>();
	}
	@Override
	void setName(String name){
		orgName= name;
	}
	
	@Override
	void setList(UserNode userObj){
		likeList.add(userObj);
	}
	
	@Override
	List<UserNode> getList(){
		return likeList;
	}
	
	@Override
	String getName() {
		return orgName;
	}
	
	@Override
	void setUserID(int id){
		orgID= id;
	}
	
	
	public int getUserID(){
		return orgID;
	}
	
	String getType(){
		return "organization";
	}
}
