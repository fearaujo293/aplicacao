package com.senai.sesi.DTO;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Produto_DTO(@NotBlank String nome,@NotNull double preco) {
	
}
