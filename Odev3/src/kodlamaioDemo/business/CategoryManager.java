package kodlamaioDemo.business;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private Category[] categories;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[] categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {
		for (Category c : categories) {
			if (c.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Kategori ismi tekrar edemez");
			}
		}
		categoryDao.add(category);

		for (Logger l : loggers) {
			l.log(category.getCategoryName());
		}
	}

}
