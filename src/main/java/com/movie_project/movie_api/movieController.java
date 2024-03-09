package com.movie_project.movie_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/movies")
public class movieController {

    @Autowired
    private movieService service;

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies(){
        return new ResponseEntity<List<Movie>>(service.findAllMovies(), HttpStatus.OK) ;
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Movie> getMoviesByImdbId(@PathVariable String imdbId){
        return new ResponseEntity<Movie>(service.findByImdbId(imdbId),HttpStatus.OK);
    }

}
