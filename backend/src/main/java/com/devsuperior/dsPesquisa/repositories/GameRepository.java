package com.devsuperior.dsPesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsPesquisa.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
