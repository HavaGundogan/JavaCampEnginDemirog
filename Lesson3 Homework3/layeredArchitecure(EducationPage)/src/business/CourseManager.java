package business;

import java.util.ArrayList;

import core.logging.Logger;

import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private Logger[] loggers;
	private CourseDao courseDao;
	private ArrayList<Course> courseList = new ArrayList<>();

	public CourseManager(CourseDao courseDao , Logger[] loggers){
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		for (Course courseCheck : courseList) {
			if (course.getPrice() < 0) {
				System.out.println("Course price cannot be less than 0");

			}
			if (course.getName().equals(courseCheck.getName())) {
				System.out.println("Course name already used");
			}

		}
		courseDao.add();

		for(Logger loggers : loggers) {
			loggers.log(course.getName());
		}
	}
}
