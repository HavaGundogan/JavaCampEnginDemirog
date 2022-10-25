package dataAccess;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add() {
		System.out.println("Course added with Jdbc");
		
	}

}
