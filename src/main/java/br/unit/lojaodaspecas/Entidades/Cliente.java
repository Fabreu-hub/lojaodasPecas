package br.unit.lojaodaspecas.Entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@Table(name = "Cliente")
@NoArgsConstructor
@AllArgsConstructor

public class Cliente implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column (name = "COD_CLIENTE")
	private Integer codcliente;
	
	@Column(name = "RG")
	private Integer rg;
	
	@Column (name = "CPF")
	private Integer cpf;
	
	@Column (name = "NOME")
	private String nome;
	
	@Column(name = "ENDERECO")
	private String endereco;
	
	

	
}
