package com.projetos.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetos.dslist.dto.GameListDTO;
import com.projetos.dslist.entities.GameList;
import com.projetos.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = repository.findAll();
		List<GameListDTO> dto =  result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
}
