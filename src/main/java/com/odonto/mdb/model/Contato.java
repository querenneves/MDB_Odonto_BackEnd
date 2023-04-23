package com.odonto.mdb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity /* gerar tabela banco de dados */
@Table(name = "tb_contato")
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Nome é obrigatório!")
	@Size(max = 100, message = "O atributo Nome deve ter no máximo 100 caracteres")
	private String nome;

	@NotBlank(message = "Convenio é obrigatório!")
	@Size(max = 100, message = "O atributo Nome deve ter no máximo 100 caracteres")
	private String convenio;

	@NotBlank(message = "Telefone é obrigatório!")
	@Column(name = "telefone", columnDefinition = "VARCHAR(20)")
	private String telefone;

}