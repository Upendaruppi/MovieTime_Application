package com.movietime.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movietime.model.Movie;
import com.movietime.repository.MovieJpaRepository;
import java.util.List;

@Service
public class MovieJpaService {

    @Autowired
    private MovieJpaRepository movieJpaRepository;

    public Movie addMovie(Movie movie) {
    	return movieJpaRepository.save(movie);
    	
    }

    public List<Movie> getMovies() {
        return movieJpaRepository.findAll();
    }

    public Movie getMovieByName(String movieName) {
        return movieJpaRepository.findByMovieName(movieName);
    }

    public void deleteMovie(int movieId) {
        movieJpaRepository.deleteById(movieId);
    }
}
