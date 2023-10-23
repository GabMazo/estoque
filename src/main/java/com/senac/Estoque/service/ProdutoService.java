package com.senac.Estoque.service;


import com.senac.Estoque.model.Produto;
import com.senac.Estoque.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id){
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto adicionarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto atualizarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
