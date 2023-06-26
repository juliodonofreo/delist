package com.projetos.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetos.dslist.dto.GameDTO;
import com.projetos.dslist.dto.GameMinDTO;
import com.projetos.dslist.entities.Game;
import com.projetos.dslist.projections.GameMinProjection;
import com.projetos.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public GameDTO findById (Long id) {
		Game result = repository.findById(id).get();
		GameDTO dto =  new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = repository.findAll();
		List<GameMinDTO> dto =  result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = repository.searchByList(listId);
		List<GameMinDTO> dto =  result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
