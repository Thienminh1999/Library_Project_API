package library.api.libraryprojectapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import library.api.libraryprojectapi.entities.Category;
import library.api.libraryprojectapi.entities.SubCategory;
import library.api.libraryprojectapi.services.templates.ICategoryService;
import library.api.libraryprojectapi.services.templates.ISubCategoryService;

@RestController
@RequestMapping("/api/")
public class CategoryController {
    @Autowired
    private ICategoryService CategoryService;

    @Autowired
    private ISubCategoryService SubCategoryService;

    //get danh sách tất cả các category
    @GetMapping(value = "/category")
    public List<Category> getAllCategory(){
        return CategoryService.getAllCategory();
    }

    //get danh sách tất cả các subCategory 
    @GetMapping(value = "/subcates")
    public List<SubCategory> getSubCate(){
        return SubCategoryService.getSubCate();
    }


}
