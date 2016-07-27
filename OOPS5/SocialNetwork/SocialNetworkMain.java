package SocialNetwork;

import java.io.IOException;

public class SocialNetworkMain {
	
	static RecordDisplay rdisplay;
	static Entity  entity;

	public static void main(String[] args) throws IOException {
		entity= new Entity();
		entity.getSourceDetail();
		rdisplay= new RecordDisplay();
		rdisplay.initialDisplay();
	}
}
