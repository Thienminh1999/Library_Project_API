package library.api.libraryprojectapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import library.api.libraryprojectapi.entities.Compose;

public interface ComposeRepository extends JpaRepository<Compose, String> {
    @Query(value = "select AuthorID from tblCompose where BookID = ?1", nativeQuery = true)
    public List<String> getAuthorIDByBookID(String bookID);
}
