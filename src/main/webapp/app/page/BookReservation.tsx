// BookReservation.tsx
// Main component for viewing and managing a book's current holder and reservation list
// Assumes backend endpoints exist for fetching book, updating current holder, and adding to reservation list

import React, { useEffect, useState } from 'react';
import { getBook, updateCurrentHolder, addToReservationList } from '../services/bookService';

interface User {
  id: number;
  name: string;
}

interface Book {
  id: number;
  title: string;
  author: string;
  currentHolder?: User | null;
  reservationList: User[];
}

export const BookReservation: React.FC<{ bookId: number }> = ({ bookId }) => {
  const [book, setBook] = useState<Book | null>(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);
  const [holderName, setHolderName] = useState('');
  const [reservationName, setReservationName] = useState('');
  const [actionError, setActionError] = useState<string | null>(null);

  // TODO: Fetch book and set to state using bookId

  const handleUpdateHolder = async () => {
    // TODO: Implement handleUpdateHolder logic
  };

  const handleAddReservation = async () => {
    // TODO: Implement handleAddReservation logic
  };

  if (loading) return <div>Loading...</div>;
  if (error || !book) return <div>{error || 'Book not found'}</div>;

  return (
    <div className="book-reservation">
      {/* TODO: Display book title, author, current holder and an input / button to update the current holders name */}
      <h2>Title: </h2>
      <p>
        <strong>Author:</strong>
      </p>
      <p>
        <strong>Current Holder:</strong>
      </p>
      <div></div>
      <h3>Reservation List</h3>
      {/* TODO: Display List of users that have a reservation on this book and add an input and button to add a user to the reservation */}
      <div></div>
      {actionError && <div style={{ color: 'red' }}>{actionError}</div>}
    </div>
  );
};
