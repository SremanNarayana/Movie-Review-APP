package com.movie_project.movie_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/reviews")
public class reviewController {

    @Autowired
    private reviewService service;

    @PostMapping
    public ResponseEntity<Review> getReview(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Review>(service.createReview(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.OK) ;
    }

}
