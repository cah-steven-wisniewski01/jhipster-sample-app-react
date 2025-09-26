package io.github.jhipster.sample.repository;

import io.github.jhipster.sample.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the Book entity using raw SQL for interview testing.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Find a book by its ID (basic, for entity mapping)
    @Query(value = "", nativeQuery = true)
    Optional<Book> findBookByIdNative(@Param("id") Long id);

    // Update the current holder of a book
    @Modifying
    @Query(value = "", nativeQuery = true)
    int updateCurrentHolder(@Param("bookId") Long bookId, @Param("userId") Long userId);

    // Add a user to the reservation list (join table)
    @Modifying
    @Query(value = "", nativeQuery = true)
    int addToReservationList(@Param("bookId") Long bookId, @Param("userId") Long userId);

    // (Optional) Fetch reservation list user IDs for a book
    @Query(value = "", nativeQuery = true)
    List<Long> findReservationUserIdsByBookId(@Param("bookId") Long bookId);
}
