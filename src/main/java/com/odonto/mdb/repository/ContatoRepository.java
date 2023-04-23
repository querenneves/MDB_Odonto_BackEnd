package com.odonto.mdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.odonto.mdb.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

	List<Contato> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}