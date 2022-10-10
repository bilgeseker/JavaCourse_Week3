package kodlamaioDemo.dataAccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    private List<Category> categories=new ArrayList<Category>();
	
	@Override
	public List<Category> getAllCategories() {
		return categories;
	}
	@Override
	public void add(Category category) {
		System.out.println("Jdbc ilge veritabanına eklendi: " + category.getCategoryName());
		this.categories.add(category);
	}

}
