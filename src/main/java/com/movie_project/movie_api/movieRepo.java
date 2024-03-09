package com.movie_project.movie_api;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface movieRepo extends MongoRepository<Movie, ObjectId> {

    Movie findMovieByImdbId(String imdbId);

}
