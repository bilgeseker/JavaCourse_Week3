package kodlamaioDemo;

import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.business.InstructorManager;
import kodlamaioDemo.core.logging.DatabaseLogger;
import kodlamaioDemo.core.logging.FileLogger;
import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.HibernateCourseDao;
import kodlamaioDemo.dataAccess.HibernateInstructorDao;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception{
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
//		Category category1 = new Category();
//		category1.setCategoryName("Yazılım");
//		Category[] categoryList = {};
//		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categoryList);
//		categoryManager.add(category1);
		
		Course course1 = new Course("Java", 10);
		Course[] courseList = {};
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courseList);
		courseManager.add(course1);
		
		Instructor instructor1 = new Instructor("Ali", "Kerem");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor1);
	}

}
