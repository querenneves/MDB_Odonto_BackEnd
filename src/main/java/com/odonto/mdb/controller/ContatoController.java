package com.odonto.mdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odonto.mdb.model.Contato;
import com.odonto.mdb.repository.ContatoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/contato")
public class ContatoController {

	@Autowired
	private ContatoRepository contatoRepository;

	@GetMapping
	public ResponseEntity<List<Contato>> getAll() {

		return ResponseEntity.ok(contatoRepository.findAll());
	}

	@PostMapping
	public ResponseEntity<Contato> post(@Valid @RequestBody Contato contato) {
		return ResponseEntity.status(HttpStatus.CREATED).body(contatoRepository.save(contato));
	}
}

