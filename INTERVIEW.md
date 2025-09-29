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

## Bonus Tasks 

### Frontend

1. **Advanced State Management**
   - Refactor the BookReservation page to use a state management library (e.g., Redux Toolkit or Zustand). Explain your choice and how it improves scalability and maintainability.

2. **Optimistic UI Updates**
   - Implement optimistic UI updates for reservation actions. Describe how you handle rollback on API failure.

3. **Accessibility & UX**
   - Audit the reservation UI for accessibility (WCAG compliance). Suggest and implement improvements.

4. **Code Splitting & Performance**
   - Analyze and optimize the frontend for bundle size and load performance (e.g., code splitting, lazy loading).

5. **Explain Your Approach**
   - Document your architectural decisions for the frontend, including component structure, state management, and error handling.

### API Flow Enhancement

1. **Transactional API Flow**
   - Enhance the reservation API to ensure all related updates (current holder, reservation list) are atomic. Explain your approach.

2. **Custom Error Handling**
   - Improve error responses with custom error objects and clear client feedback for edge cases.

3. **API Versioning**
   - Propose and implement a versioning strategy for the reservation API to support future changes.

### Database

1. **Schema Design & Normalization**
   - Review the current schema for books, users, and book_reservation_list. Identify any normalization issues and propose improvements.

2. **Indexing & Query Optimization**
   - Analyze the most frequent queries (e.g., fetching reservation lists, updating holders). Add appropriate indexes and explain your choices.

3. **Transactional Integrity**
   - Ensure all reservation-related updates are performed within a single transaction. Describe how you would handle rollback and concurrency.

4. **Advanced SQL**
   - Write a query to fetch all books currently reserved by a specific user, including their position in the reservation list.

5. **Migration Strategy**
   - Propose a strategy for evolving the database schema (e.g., adding new fields, changing relationships) with minimal downtime using Liquibase.

### Security & Data Validation

1. **Security Audit**
   - Identify and mitigate potential security risks in backend and frontend code (e.g., SQL injection, XSS, CSRF).
   - Implement input validation and sanitization for all user-provided data.

### Automated Testing

1. **Integration & End-to-End Tests**
   - Implement integration and end-to-end tests for critical flows (e.g., book reservation, error handling).
   - Provide a test strategy and coverage report.

### Monitoring & Observability

1. **Logging & Metrics**
   - Add logging, metrics, or tracing to key backend operations (e.g., reservation, API errors).
   - Suggest monitoring tools and alerting strategies for production.

### Scalability & Fault Tolerance

1. **Scalability Strategy**
   - Discuss or implement strategies for scaling the reservation system (e.g., caching, database sharding, load balancing).
   - Explain how to handle failures or downtime gracefully.

