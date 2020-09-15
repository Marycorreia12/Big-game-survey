package com.devsuperior.dsPesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsPesquisa.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository< Genre, Long>{

}
