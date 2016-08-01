package CounselingSystem;

import java.io.IOException;

public class CounselingMain {

	public static void main(String[] args) throws IOException {
		Entity entity = new Entity();
		entity.getCollegeDetail();
		entity.getStudentDetail();
		CounselingProcess cprocess = new CounselingProcess();
		cprocess.display();
	}

}
