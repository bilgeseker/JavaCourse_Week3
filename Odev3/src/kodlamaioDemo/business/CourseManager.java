package kodlamaioDemo.business;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private Course[] courses;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers, Course[] courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	public void add(Course course) throws Exception{
		if(course.getCoursePrice() < 0)
		{
			throw new Exception("Kurs fiyatı 0'dan az olamaz");
		}
		for(Course c : courses) {
			if(c.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs ismi tekrar edemez");
			}
			
		}
		courseDao.add(course);
		
		for(Logger l : loggers) {
			l.log(course.getCourseName());
		}
	}
	
}
