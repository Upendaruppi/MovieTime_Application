package com.movietime.controller;

import com.movietime.model.Movie;
import com.movietime.model.MovieTickets;
import com.movietime.repository.MovieTicketsJpaRepository;
import com.movietime.service.MovieTicketsJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movietickets")
public class MovieTicketsController {

    @Autowired
    private MovieTicketsJpaService movieTicketsJpaService;

    
    @PostMapping("/buy")
    public MovieTickets buyTicketByUserId(@RequestParam int userId, @RequestParam int movieId, @RequestParam String showTime) {
        return movieTicketsJpaService.buyTicketByUserId(userId, movieId, showTime);
    }
    
    @GetMapping("/{userId}")
    public List<MovieTickets> getMovieTicketsByUserId(@PathVariable int userId) {
        return movieTicketsJpaService.getMovieTicketsByUserId(userId);
    }
}
