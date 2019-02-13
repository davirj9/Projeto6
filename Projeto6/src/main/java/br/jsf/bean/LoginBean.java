package br.jsf.bean;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.jsf.bo.UsuarioBo;

/**
 * @author Davi Maçana
 *
 */
@Named(value="login")
@ViewScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioBo usuarioBo;
	
	private String usuario;
	private String senha;
	
	public String login() {
		usuarioBo.autenticarUsuario();
		return "sistema/home?faces-redirect=true";
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
