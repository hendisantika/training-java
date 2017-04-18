package com.hendisantika.movie.services;

import com.hendisantika.movie.models.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by hendisantika on 4/17/17.
 */
public interface IMovieRepository extends CrudRepository<Movie, Long> {
    List<Movie> findByYearLessThan(int year);
}
