package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor insturctor) {
		System.out.println("Jdbc ile veritabanına eklendi: " + insturctor.getFirstName() + " " + insturctor.getLastName());
	}

}
