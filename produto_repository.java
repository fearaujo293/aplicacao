package com.senai.sesi.repository;

import com.senai.sesi.Model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface produto_repository extends JpaRepository<ProdutoModel, Integer>{

	
}
