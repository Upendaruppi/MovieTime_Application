package com.movietime.controller;

import com.movietime.model.Movie;
import com.movietime.model.MovieTickets;
import com.movietime.repository.MovieTicketsJpaRepository;
import com.movietime.service.MovieTicketsJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movietickets")
public class MovieTicketsController {

    @Autowired
    private MovieTicketsJpaService movieTicketsJpaService;

    @PostMapping("/buy")
    public MovieTickets buyTicketByUserId(@RequestBody TicketPurchaseRequest request) {
        return movieTicketsJpaService.buyTicketByUserId(request.getUserId(), request.getMovieId(), request.getShowTime());
    }

    
    @GetMapping("/{userId}")
    public List<MovieTickets> getMovieTicketsByUserId(@PathVariable int userId) {
        return movieTicketsJpaService.getMovieTicketsByUserId(userId);
    }
}
