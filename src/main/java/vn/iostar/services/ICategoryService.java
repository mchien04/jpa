package vn.iostar.services;

import java.util.List;

import vn.iostar.entity.Category;

public interface ICategoryService {
	int count();

	List<Category> findAll(int page, int pagesize);

	List<Category> searchByName(String catname);

	Category findByCategoryname(String name) throws Exception;

	List<Category> findAll();

	Category findById(int cateid);

	void delete(int cateid) throws Exception;

	void update(Category category);

	void insert(Category category);

}
