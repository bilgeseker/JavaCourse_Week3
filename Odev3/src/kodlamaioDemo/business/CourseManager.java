package kodlamaioDemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception{
		List<Course> courses = courseDao.getAllCourses();
		
		for(Course c : courses) {
			
			if(c.getCourseName()==(course.getCourseName())) {
				throw new Exception("Kurs ismi tekrar edemez");
			}
			
		}
		courseDao.add(course);
		
		for(Logger l : loggers) {
			l.log(course.getCourseName());
		}
	}
	
}
