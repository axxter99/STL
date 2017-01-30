package za.co.davidhorwitz.stl;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.link.ResourceLink;
import org.apache.wicket.markup.html.WebPage;

public class Index extends WebPage {
	private static final long serialVersionUID = 1L;

	public Index(final PageParameters parameters) {
		super(parameters);
		int next = 101;
		int prev = 1;
		// add(new Label("version",
		// getApplication().getFrameworkSettings().getVersion()));

		// TODO Add your page's components here
		// add(new Link("setting", null));
		if (next <= 100) {
			//add(new Label("next1", "next"));
		}
		if (prev >= 0) {
			//add(new Label("previous1", "previous"));
		}
	}
}
