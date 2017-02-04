package org.sakai.stl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import uk.org.ponder.rsf.components.UIContainer;
import uk.org.ponder.rsf.components.UIOutput;
import uk.org.ponder.rsf.view.ComponentChecker;
import uk.org.ponder.rsf.view.DefaultView;
import uk.org.ponder.rsf.view.ViewComponentProducer;
import uk.org.ponder.rsf.viewstate.ViewParameters;

public class MainViewProducer  implements ViewComponentProducer, DefaultView{

	private static Log log = LogFactory.getLog(MainViewProducer.class);
	public static final String VIEW_ID = "Index";
	
	@Override
	public void fillComponents(UIContainer tofill, ViewParameters viewparams, ComponentChecker checker) {
	
		log.info("OK!");
		
		UIOutput.make(tofill, "previous1", "previous");
		UIOutput.make(tofill, "next1", "next");
	}

	
	@Override
	public String getViewID() {
		return VIEW_ID;
	}

}
