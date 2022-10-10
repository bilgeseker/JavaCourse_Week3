package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
	@Override
	public void add(Instructor insturctor) {
		System.out.println("Hibernate ile veritabanına eklendi: " + insturctor.getFirstName() + " " + insturctor.getLastName());
	}
}
