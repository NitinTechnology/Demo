package in.ineuron.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ineuron.bean.Student;

public class JavatoJsonApp {
	public static void main(String[] args) throws JsonProcessingException {

		javaObjectToJson();

		//javaObjectsToJson();

	}

	/*
	 * private static void javaObjectsToJson() throws JsonProcessingException {
	 * Student s1 = new Student(); s1.setSid(10); s1.setSaddress("IND");
	 * s1.setSname("sachin");
	 * 
	 * Student s2 = new Student(); s2.setSid(9); s2.setSaddress("WI");
	 * s2.setSname("lara");
	 * 
	 * List<Student> listOfStudents = new ArrayList<Student>();
	 * listOfStudents.add(s1); listOfStudents.add(s2);
	 * 
	 * ObjectMapper mapper = new ObjectMapper(); String json =
	 * mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listOfStudents);
	 * System.out.println("\n" + json); }
	 */

	private static void javaObjectToJson() throws JsonProcessingException {
		Student student = new Student();
		student.setSid(10);
		student.setSaddress("IND");
		student.setSname("sachin");

		ObjectMapper mapper = new ObjectMapper();
		String studentJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
		// String studentJson = mapper.writeValueAsString(student);
		System.out.println("\n"+studentJson);
	}
}
