package za.co.davidhorwitz.stl;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class Setting extends WebPage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Setting(final PageParameters parameters) {
		super(parameters);
		//add(new Label("message", "Hello World!"));
	}
}
