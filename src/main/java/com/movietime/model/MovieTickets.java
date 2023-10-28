package com.movietime.model;

import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "movieticket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieTickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticketId", unique = true)
    private int ticketId;

    @JsonBackReference
    @ManyToOne // Each ticket is associated with one movie
    @JoinColumn(name = "movieId")
    private Movie movie;

    @Column(name = "showTime")
    private String showTime;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

  /*  @ManyToOne
    @JoinColumn(name = "theatreId")
    private Theatres theatre;*/

    
}
