package library.api.libraryprojectapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import library.api.libraryprojectapi.entities.RentDetailInfo;

public interface RentDetailRepository extends JpaRepository<RentDetailInfo, String> {
    @Query(value = "select BookID from tblRentDetail where RentID = ?1", nativeQuery = true)
    public List<String> findAllBookIDByRentID(String RentID);

    
}
