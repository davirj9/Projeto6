package br.jsf.converter;

import java.net.URI;
import java.net.URISyntaxException;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.inject.Named;

/**
 * @author Davi Maçana
 *
 */
@Named
@RequestScoped
@SuppressWarnings("rawtypes")
public class UrlConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		StringBuilder url = new StringBuilder();

	      if(!value.startsWith("http://", 0)) {
	         url.append("http://");
	      }
	      url.append(value);

	      try {
	         new URI(url.toString());	        
	      } catch (URISyntaxException e) {
	         FacesMessage msg = new FacesMessage("Error converting URL",
	            "Invalid URL format");
	         msg.setSeverity(FacesMessage.SEVERITY_ERROR);
	         throw new ConverterException(msg);
	      }

	      return url.toString();
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return value.toString();
	}

}
