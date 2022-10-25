package dataAccess;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add() {
		System.out.println("Category added with Hibernate");
		
	}

}
