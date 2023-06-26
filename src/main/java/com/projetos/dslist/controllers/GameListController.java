package com.projetos.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetos.dslist.dto.GameListDTO;
import com.projetos.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	GameListService service;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = service.findAll();
		return result;
	}
}
