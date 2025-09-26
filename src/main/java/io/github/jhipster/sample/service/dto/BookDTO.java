package io.github.jhipster.sample.service.dto;

import java.util.List;

public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private UserDTO currentHolder;
    private List<UserDTO> reservationList;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public UserDTO getCurrentHolder() { return currentHolder; }
    public void setCurrentHolder(UserDTO currentHolder) { this.currentHolder = currentHolder; }

    public List<UserDTO> getReservationList() { return reservationList; }
    public void setReservationList(List<UserDTO> reservationList) { this.reservationList = reservationList; }
}

