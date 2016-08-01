package CounselingSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This will read data from file and
 *  initializes student and college queue
 */

public class Entity {

	BufferedReader in = null;
	BufferedWriter out = null;
	static MyQueue studentQueue = new MyQueue();
	static MyQueue collegeQueue = new MyQueue();
	static MyArrayList studentList = new MyArrayList();
	static MyArrayList collegeList = new MyArrayList();

	public void getStudentDetail() throws IOException {
		String line;

		try {
			in = new BufferedReader(new FileReader(
					".//src//CounselingSystem//studentList.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while ((line = in.readLine()) != null) {
			String str[] = line.split(",");
			Student student = new Student(str[0], Integer.parseInt(str[1]));
			studentQueue.enqueue(student);
			studentList.add(student);
		}
	}

	public void getCollegeDetail() throws IOException {
		String line;

		try {
			in = new BufferedReader(new FileReader(
					".//src//CounselingSystem//collegeList.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while ((line = in.readLine()) != null) {
			String str[] = line.split(",");
			College college = new College(str[0], Integer.parseInt(str[1]),
					Integer.parseInt(str[2]));
			collegeQueue.enqueue(college);
			collegeList.add(college);
		}
	}

	public static MyQueue getStudentQueue() {
		return studentQueue;
	}

	public static MyQueue getCollegeQueue() {
		return collegeQueue;
	}

	public static MyArrayList getStudentList() {
		return studentList;
	}

	public static MyArrayList getCollegeList() {
		return collegeList;
	}

}
