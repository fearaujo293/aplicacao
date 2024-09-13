package com.senai.sesi.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.senai.sesi.DTO.Produto_DTO;
import com.senai.sesi.Model.ProdutoModel;
import com.senai.sesi.repository.produto_repository;

import jakarta.validation.Valid;
@RestController

public class Produto_controller {
	@Autowired
	produto_repository produtoRepository;

	@PostMapping("/produtos")
	public ResponseEntity<Object> salvarProduto(@RequestBody @Valid Produto_DTO produtoDTO) {
	ProdutoModel produtoModel = new ProdutoModel(); 
	BeanUtils.copyProperties(produtoDTO, produtoModel);
	    return ResponseEntity.status(HttpStatus.CREATED).body((produtoRepository).save(produtoModel));

	}
	
	@GetMapping("/produtos")
	public ResponseEntity<List<ProdutoModel>> pegarTodosProdutos() {
		return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.findAll());
	}
	}
