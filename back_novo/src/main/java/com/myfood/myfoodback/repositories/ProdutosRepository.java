package com.myfood.myfoodback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myfood.myfoodback.models.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
}
