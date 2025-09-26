package io.github.jhipster.sample.domain;

import io.github.jhipster.sample.domain.User;

import java.util.List;

public class Book {
    private Long id;
    private String title;
    private String author;
    private User currentHolder;
    private List<User> reservationList;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public User getCurrentHolder() { return currentHolder; }
    public void setCurrentHolder(User currentHolder) { this.currentHolder = currentHolder; }

    public List<User> getReservationList() { return reservationList; }
    public void setReservationList(List<User> reservationList) { this.reservationList = reservationList; }
}
