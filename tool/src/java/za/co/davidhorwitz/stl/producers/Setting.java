package za.co.davidhorwitz.stl.producers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.org.ponder.rsf.components.UIContainer;
import uk.org.ponder.rsf.view.ComponentChecker;
import uk.org.ponder.rsf.view.ViewComponentProducer;
import uk.org.ponder.rsf.viewstate.ViewParameters;
import za.co.davidhorwitz.stl.renderers.NavBarRenderer;

public class Setting implements ViewComponentProducer {

	private static Logger log = LoggerFactory.getLogger(Setting.class);
	
	public static final String VIEW_ID = "Setting";
	
	private NavBarRenderer navBarRenderer;
	public void setNavBarRenderer(NavBarRenderer navBarRenderer) {
		this.navBarRenderer = navBarRenderer;
	}
	@Override
	public void fillComponents(UIContainer tofill, ViewParameters viewparams, ComponentChecker checker) {
		// TODO Auto-generated method stub
		log.info("OK! Setting!");
		navBarRenderer.makeNavBar(tofill, "navIntraTool:", VIEW_ID); 
	}

	@Override
	public String getViewID() {
		return VIEW_ID;
	}

}
