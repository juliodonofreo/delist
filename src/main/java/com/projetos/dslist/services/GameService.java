package com.projetos.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetos.dslist.dto.GameMinDTO;
import com.projetos.dslist.entities.Game;
import com.projetos.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = repository.findAll();
		List<GameMinDTO> dto =  result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
