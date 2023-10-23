package com.senac.Estoque.repository;

import com.senac.Estoque.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {
}
