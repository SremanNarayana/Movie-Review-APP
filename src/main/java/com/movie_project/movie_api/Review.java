package com.movie_project.movie_api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Document(collection = "movie_api")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId id;
    private String body;
    private LocalDate created;
    private LocalDate update;

    public Review(String body, LocalDate created, LocalDate update) {
        this.body = body;
        this.created = created;
        this.update = update;
    }


}
