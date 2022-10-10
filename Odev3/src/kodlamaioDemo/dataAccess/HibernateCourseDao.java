package kodlamaioDemo.dataAccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;

public class HibernateCourseDao implements CourseDao{
	private List<Course> courses = new ArrayList<Course>();
	@Override
	public List<Course> getAllCourses() {
		return courses;
	}
	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına eklendi: " + course.getCourseName());
		this.courses.add(course);
	}
	

}
