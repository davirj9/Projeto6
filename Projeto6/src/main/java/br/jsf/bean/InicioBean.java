package br.jsf.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.jsf.bo.UsuarioBo;
import br.jsf.model.Usuario;

/**
 * @author Davi Maçana
 *
 */
@Named
public class InicioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Usuario usuario = new Usuario();

	@Inject
	private UsuarioBo usuarioBo;
	
	@PostConstruct
	public void init() {
		usuario = usuarioBo.autenticarUsuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
