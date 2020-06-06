package br.unit.lojaodaspecas.Entidades;

import java.io.Serializable;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Vendedor")
@NoArgsConstructor
@AllArgsConstructor

public class Vendedor implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_VENDEDOR")
	private Integer codvendedor;
	
	@Column(name = "RG")
	private Integer rg;
	
	@Column(name = "CPF")
	private Integer cpf;
	
	@Column(name = "NOME")
	private String nome;
	
	
	@Column(name = "ENDERECO")
	private String endereco;
	
	
}
