package com.projetos.dslist.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
