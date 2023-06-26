package com.projetos.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetos.dslist.dto.GameDTO;
import com.projetos.dslist.dto.GameMinDTO;
import com.projetos.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	GameService service;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = service.findAll();
		return result;
	}
}
