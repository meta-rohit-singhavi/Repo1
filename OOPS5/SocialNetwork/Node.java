package SocialNetwork;

import java.util.List;

public abstract class Node {
	
	abstract void setUserID(int id);
	abstract void setName(String name);
	abstract String getName();
	abstract void setList(UserNode userObj);
	abstract List<UserNode> getList();
	abstract String getType();
}
