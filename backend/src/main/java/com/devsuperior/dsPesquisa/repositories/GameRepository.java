package com.devsuperior.dsPesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsPesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
