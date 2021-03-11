package library.api.libraryprojectapi.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import library.api.libraryprojectapi.entities.Category;
import library.api.libraryprojectapi.repositories.CategoryRepository;
import library.api.libraryprojectapi.services.templates.ICategoryService;

@Repository
public class CategoryServiceImp implements ICategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }

    public Category getCategoryById(String id){
        return categoryRepository.findByCategoryID(id);
    }
}
