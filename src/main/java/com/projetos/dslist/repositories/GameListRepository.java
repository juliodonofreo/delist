package com.projetos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
}
