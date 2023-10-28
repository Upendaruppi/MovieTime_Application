package com.movietime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.movietime.model.Movie;
import com.movietime.service.MovieJpaService;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieJpaService movieJpaService;

    @PostMapping("/add")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieJpaService.addMovie(movie);
    }

    @GetMapping("/getmovies")
    public List<Movie> getMovies() {
        return movieJpaService.getMovies();
    }

    @GetMapping("/{moviename}")
    public Movie findByMovieName(@PathVariable String movieName) {
        return movieJpaService.getMovieByName(movieName);
    }

    @DeleteMapping("/delete/{movieId}")
    public void deleteMovie(@PathVariable int movieId) {
        movieJpaService.deleteMovie(movieId);
    }
}
