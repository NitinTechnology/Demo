package in.ineuron.main;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ineuron.bean.Student;

public class JsontoJavaApp {
	public static void main(String[] args) throws IOException {

		File file = new File("students.json");

		ObjectMapper mapper = new ObjectMapper();
		Student[] students = mapper.readValue(file, Student[].class);
		for (Student student : students) {
			System.out.println(student);
		}

		System.out.println("some changes i made here");

	}

}
