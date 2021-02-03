package library.api.libraryprojectapi.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import library.api.libraryprojectapi.entities.Rent;
public interface RentRepository extends JpaRepository<Rent, String> {
    public List<Rent> findAllByUserID(String UserID); 
}
