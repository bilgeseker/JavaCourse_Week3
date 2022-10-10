package kodlamaioDemo;

import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.core.logging.DatabaseLogger;
import kodlamaioDemo.core.logging.FileLogger;
import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.HibernateCourseDao;
import kodlamaioDemo.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception{
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
//		Category category1 = new Category();
//		category1.setCategoryName("Yazılım");
//		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
//		categoryManager.add(category1);
//		Category category2 = new Category();
//		category2.setCategoryName("Yazılım");
//		categoryManager.add(category2);
		
		Course course1 = new Course("Java", 10);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		Course course2 = new Course("Java", 10);
		courseManager.add(course2);
		
//		Instructor instructor1 = new Instructor("Ali", "Kerem");
//		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
//		instructorManager.add(instructor1);
	}

}
