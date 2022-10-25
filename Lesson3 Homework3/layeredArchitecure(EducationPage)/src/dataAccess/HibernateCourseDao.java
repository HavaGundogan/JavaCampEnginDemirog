package dataAccess;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add() {
		System.out.println("Course added with Hibernate");
		
	}

}
