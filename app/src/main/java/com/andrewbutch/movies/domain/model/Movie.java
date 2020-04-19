package com.andrewbutch.movies.domain.model;
// API response
//{
//        Title: "Star Wars: Episode IV - A New Hope",
//        Year: "1977",
//        Rated: "PG",
//        Released: "25 May 1977",
//        Runtime: "121 min",
//        Genre: "Action, Adventure, Fantasy, Sci-Fi",
//        Director: "George Lucas",
//        Writer: "George Lucas",
//        Actors: "Mark Hamill, Harrison Ford, Carrie Fisher, Peter Cushing",
//        Plot: "Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee and two droids to save the galaxy from the Empire's world-destroying battle station, while also attempting to rescue Princess Leia from the mysterious Darth Vader.",
//        Language: "English",
//        Country: "USA",
//        Awards: "Won 6 Oscars. Another 52 wins & 28 nominations.",
//        Poster: https://m.media-amazon.com/images/M/MV5BNzVlY2MwMjktM2E4OS00Y2Y3LWE3ZjctYzhkZGM3YzA1ZWM2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg,
//        Ratings: [
//        {
//        Source: "Internet Movie Database",
//        Value: "8.6/10"
//        },
//        {
//        Source: "Rotten Tomatoes",
//        Value: "92%"
//        },
//        {
//        Source: "Metacritic",
//        Value: "90/100"
//        }
//        ],
//        Metascore: "90",
//        imdbRating: "8.6",
//        imdbVotes: "1,181,083",
//        imdbID: "tt0076759",
//        Type: "movie",
//        DVD: "21 Sep 2004",
//        BoxOffice: "N/A",
//        Production: "20th Century Fox",
//        Website: "N/A",
//        Response: "True"
//        }


import com.google.gson.annotations.SerializedName;

public class Movie extends MoviePreview {
    @SerializedName("Runtime")
    String duration;
    @SerializedName("imdbRating")
    String rating;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
