package library.api.libraryprojectapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import library.api.libraryprojectapi.entities.SubCategory;
import library.api.libraryprojectapi.repositories.SubCategoryRepository;
import library.api.libraryprojectapi.services.templates.ISubCategoryService;

@Repository
public class SubCategoryServiceImp implements ISubCategoryService {
    @Autowired
    private SubCategoryRepository SubCategoryRepository;

    @Override
    public List<SubCategory> getSubCate() {
        return SubCategoryRepository.findAll();
    }
}
