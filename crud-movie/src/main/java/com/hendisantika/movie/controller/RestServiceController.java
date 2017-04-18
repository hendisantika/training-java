package com.hendisantika.movie.controller;

import com.hendisantika.movie.models.Movie;
import com.hendisantika.movie.services.IMovieRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hendisantika on 4/17/17.
 */
@RestController
public class RestServiceController {
    @Autowired
    private IMovieRepository repo;

    static final Logger logger = LogManager.getLogger(RestServiceController.class.getName());

    // CREATE
    @RequestMapping("/movies/create")
    @ResponseBody
    public String createMovie(String title, int year) {
        Movie movie = new Movie(title, year);
        try {
            repo.save(movie);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return e.getMessage();
        }
        logger.info("creation successful: " + String.valueOf(movie.getId()));
        return "creation successful: " + String.valueOf(movie.getId());
    }

    // READ
    @RequestMapping("/movies/read")
    @ResponseBody
    public String readMovie(long id) {
        Movie movie;
        try {
            movie = repo.findOne(id);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return e.getMessage();
        }
        if (movie == null) {
            String errorMst = "no movie found for id " + id;
            logger.error(errorMst);
            return errorMst;
        } else {
            logger.info("Data --> " + movie.getTitle() + " : " + movie.getYear());
            return movie.getTitle() + " : " + movie.getYear();
        }
    }

    // READ ALL
    @RequestMapping("/movies/all")
    @ResponseBody
    public List<Movie> readAll() {
        logger.info("Get All Movies " + (List<Movie>) repo.findAll());
       return (List<Movie>) repo.findAll();
    }

    // UPDATE
    @RequestMapping("/movies/update")
    @ResponseBody
    public String readMovie(long id, String title, int year) {
        Movie movie;
        try {
            movie = repo.findOne(id);
            movie.setTitle(title);
            movie.setYear(year);
            repo.save(movie);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return e.getMessage();
        }
        logger.info("Update data : " + movie.getTitle() + " : " + movie.getYear());
        return movie.getTitle() + " : " + movie.getYear();
    }

    // DELETE
    @RequestMapping("/movies/delete")
    @ResponseBody
    public String deleteMovie(long id) {
        try {
            repo.delete(id);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return e.getMessage();
        }
        logger.info("deletion successful");
        return "deletion successful";
    }

    @RequestMapping("/movies/readAllBeforeYear")
    public List<Movie> getMoviesBeforeYear(@RequestParam(value = "year") int year) {
        List<Movie> movies = repo.findByYearLessThan(year);
        logger.info("Read All Data Before year " + movies);
        return movies;
    }
}
