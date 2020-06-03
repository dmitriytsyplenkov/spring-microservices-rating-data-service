package com.dts.ratingdataservice.resources;

import com.dts.ratingdataservice.models.Rating;
import com.dts.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable String userId) {
        return new UserRating(Arrays.asList(
                new Rating("500", 5),
                new Rating("100", 4)
        ),userId);

    }

}
