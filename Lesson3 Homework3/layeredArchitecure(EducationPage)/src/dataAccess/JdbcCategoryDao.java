package dataAccess;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add() {
		System.out.println("Category added with Jdbc");
		
	}

}
