package library.api.libraryprojectapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import library.api.libraryprojectapi.entities.RentDetailInfo;

public interface RentDetailRepository extends JpaRepository<RentDetailInfo, String> {
    
}
