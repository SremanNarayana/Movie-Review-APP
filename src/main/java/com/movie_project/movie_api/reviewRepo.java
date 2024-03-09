package com.movie_project.movie_api;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reviewRepo extends MongoRepository<Review, ObjectId> {
}
