package HomeWorkGenericsAndCollections;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws MyException {

		ArrayList<Student> gr = new ArrayList<Student>();

		gr.add(new Student("Alexander", "Ts", 19, true, 1234, "PN-121"));
		gr.add(new Student("Ekaterina", "Rez", 18, false, 1253, "PN-121"));
		gr.add(new Student("Alexey", "St", 20, true, 14523, "PN-121"));
		gr.add(new Student("Irina", "Iv", 23, false, 12213, "PN-121"));
		gr.add(new Student("Olga", "Cher", 17, false, 1243, "PN-121"));
		gr.add(new Student("Andrey", "Pop", 18, true, 12123, "PN-121"));

		System.out.println(gr);

		Group newstud = null;
		File fileTwo = new File("PN-121.txt");

		try {
			newstud = (Group) Group.loadObject(fileTwo);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();

		}

		System.out.println(newstud);
	}
}