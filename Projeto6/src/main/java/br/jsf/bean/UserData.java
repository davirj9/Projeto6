package br.jsf.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * @author Davi Maçana
 *
 */
@Named(value="userData")
@SessionScoped
public class UserData implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
