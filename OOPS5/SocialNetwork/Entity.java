package SocialNetwork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * This class will read sourceInfo file 
 * to initialize user list and organization list
 */
public class Entity {
	
	BufferedReader in = null;
	BufferedWriter out = null;
	static List<UserNode> uList;
	static List<OrganizationNode> oList;
	
	/**
	 * This method read sorceInfo file and
	 * fills user list and organization list accordingly
	 * @throws IOException
	 */
	public void getSourceDetail() throws IOException{
		String line;
		uList= new LinkedList<UserNode>();
		oList= new LinkedList<OrganizationNode>();
	try {
		in = new BufferedReader(new FileReader(".//src//SocialNetwork//sourceInfo.txt"));
		out = new BufferedWriter(new FileWriter(".//src//SocialNetwork//report.txt", true));
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	while((line = in.readLine()) != null)
	{	
		String str[]= line.split(",");
		if(str[2].trim().equalsIgnoreCase("user")){
			UserNode ob= new UserNode();
			ob.setUserID(Integer.parseInt(str[0]));
			ob.setName(str[1]);
			uList.add(ob);
		}
		else if(str[2].trim().equalsIgnoreCase("organization")){
			OrganizationNode ob= new OrganizationNode();
			ob.setUserID(Integer.parseInt(str[0]));
			ob.setName(str[1]);
			oList.add(ob);
		}
	}
}
	
	public static List<UserNode> getUserList(){
		return uList;
	}
	
	public static List<OrganizationNode> getOrgList(){
		return oList;
	}
}