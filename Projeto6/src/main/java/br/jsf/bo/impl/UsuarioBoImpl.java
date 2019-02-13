package br.jsf.bo.impl;

import javax.enterprise.context.RequestScoped;

import br.jsf.bo.UsuarioBo;
import br.jsf.model.Usuario;

/**
 * @author Davi Maçana
 *
 */
@RequestScoped
public class UsuarioBoImpl implements UsuarioBo {

	@Override
	public Usuario autenticarUsuario() {
		return new Usuario("Davi Maçana", "123");
	}
}
