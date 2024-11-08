package com.dh.serieservice.domain.repository;

import com.dh.serieservice.domain.model.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerieRepository extends MongoRepository<Serie, Long> {
    List<Serie> findAllByGenre(String genre);

}
