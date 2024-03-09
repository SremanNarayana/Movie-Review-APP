package com.movie_project.movie_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class movieService {

    @Autowired
    private movieRepo repo;

    public List<Movie> findAllMovies(){
        return repo.findAll();
    }

    public Movie findByImdbId(String imdbId){

        return repo.findMovieByImdbId(imdbId);

    }



}
