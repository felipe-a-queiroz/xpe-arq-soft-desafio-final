package com.desafiofinal.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafiofinal.api.model.Produto;
import com.desafiofinal.api.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }
    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }
    public List<Produto> buscarPorNome(String nome) {
        return produtoRepository.findByNomeContainingIgnoreCase(nome);
    }
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }
    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }
    public Produto atualizar(Produto produto) {
        return produtoRepository.save(produto);
    }
    public long contarProdutos() {
        return produtoRepository.count();
    }
}
