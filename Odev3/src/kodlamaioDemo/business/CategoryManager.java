package kodlamaioDemo.business;

import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		List<Category> categories =categoryDao.getAllCategories();
		for (Category c : categories) {
			if (c.getCategoryName()==category.getCategoryName()) {
				throw new Exception("Kategori ismi tekrar edemez");
			}
		}
		categoryDao.add(category);

		for (Logger l : loggers) {
			l.log(category.getCategoryName());
		}
	}

}
