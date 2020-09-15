package com.devsuperior.dsPesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsPesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
