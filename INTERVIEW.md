# Book Reservation Interview Tasks

This project contains incomplete code for a Book Reservation feature. Your task is to complete the backend and frontend logic, focusing on SQL, Java, and TypeScript/React. The goal is to test your ability to work with raw SQL, Spring Data, and React.

## Backend Tasks

1. **Liquibase SQL Changelog**
   - Complete the SQL in `src/main/resources/config/liquibase/changelog/20250926_added_books_and_users.sql`:
     - Add correct column types and constraints for the `books` table.
     - A `users` table already exists with id and login, use the `id` and `login` as the `name` for the current holder and reservation list.
     - Create a table (e.g., `book_reservation_list`) to implement the many-to-many reservation list between books and users.
     - Add all necessary foreign keys and indexes.
   - **File:** `src/main/resources/config/liquibase/changelog/20250926_added_books_and_users.sql`

2. **BookRepository (Raw SQL)**
   - In `BookRepository.java`, fill in the raw SQL for the following methods:
     - `findBookByIdNative(Long id)`: Select a book by ID.
     - `updateCurrentHolder(Long bookId, Long userId)`: Update the current holder of a book.
     - `addToReservationList(Long bookId, Long userId)`: Insert a user into the reservation list for a book.
     - `findReservationUserIdsByBookId(Long bookId)`: Select all user IDs in a book's reservation list.
   - **File:** `src/main/java/io/github/jhipster/sample/repository/BookRepository.java`

3. **BookService**
   - In `BookService.java`, implement the logic for:
     - Fetching a book and its reservation list.
     - Updating the current holder of a book.
     - Adding a user to the reservation list.
   - Use the repository methods you implemented above.
   - **File:** `src/main/java/io/github/jhipster/sample/service/BookService.java`

## Frontend Tasks

4. **BookReservation Page**
   - In `BookReservation.tsx`:
     - Use the route parameter to get the `bookId`.
     - Fetch the book data using the provided service.
     - Display the book's title, author, current holder, and reservation list.
     - Implement the logic to update the current holder and add to the reservation list.
   - **File:** `src/main/webapp/app/page/BookReservation.tsx`

5. **bookService.tsx**
   - Implement the API calls in `bookService.tsx` for:
     - `getBook(bookId)`
     - `updateCurrentHolder(bookId, userName)`
     - `addToReservationList(bookId, userName)`
   - **File:** `src/main/webapp/app/services/bookService.tsx`

## General Notes

- Focus on using raw SQL in the repository for all database operations.
- Make sure your SQL is correct and efficient.
- Follow the TODOs in each file for guidance.
- You may add additional helper methods or DTOs as needed.
