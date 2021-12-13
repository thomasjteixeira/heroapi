package com.github.thomasjteixeira.heroesapi.repository;

import com.github.thomasjteixeira.heroesapi.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

    @EnableScan
    public interface HeroesRepository extends CrudRepository<Heroes, String>{

    }
