package business;

import java.util.ArrayList;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
	private Logger[] loggers;
	private CategoryDao categoryDao;
	private ArrayList<Category> categoryList = new ArrayList<>();

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		
		for(Category categoryCheck : categoryList) {
		
		if(category.getName().equals(categoryCheck.getName())) {
		throw new  Exception("Category name already taken");
		}
		
	}
		
		
		categoryDao.add();
		
		categoryList.add(category);
		
		for(Logger logger : loggers) {
			logger.log(category.getName());
		}

}
}
