package library.api.libraryprojectapi.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import library.api.libraryprojectapi.entities.Rent;
public interface RentRepository extends JpaRepository<Rent, String> {
    
}
