package com.renovatech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo CNPJ é Obrigatório")
    @Size(min = 10, max = 20 , message = "O atributo CNPJ deve conter no mínimo 10 e no máximo 20 caracteres")
	private String cnpj;
	
	@NotBlank(message = "O atributo razão social é Obrigatório!!") 
    @Size(min = 5, max =  300, message = "O atributo titulo deve conter no mínimo 05 e no máximo 300 caracteres") 
	private String razaoSocial;
	
	@NotBlank(message = "O atributo email é Obrigatório!") 
    @Size(min = 5, max = 50, message = "O atributo email deve conter no mínimo 05 e no máximo 50 caracteres")
    private String email;
	
	@NotBlank(message = "O atributo senha  é Obrigatório!") 
    @Size(min = 8, max = 500, message = "O atributo senha deve conter no mínimo 08 e no máximo 30 caracteres")
    private String senha;
	
	@Size(max = 5000)
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
}
