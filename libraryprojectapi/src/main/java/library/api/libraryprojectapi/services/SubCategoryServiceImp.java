package library.api.libraryprojectapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import library.api.libraryprojectapi.repositories.SubCategoryRepository;
import library.api.libraryprojectapi.services.templates.ISubCategoryService;

@Repository
public class SubCategoryServiceImp implements ISubCategoryService {
    @Autowired
    private SubCategoryRepository SubCategoryRepository;
}
