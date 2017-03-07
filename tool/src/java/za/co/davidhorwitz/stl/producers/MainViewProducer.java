package za.co.davidhorwitz.stl.producers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import uk.org.ponder.messageutil.MessageLocator;
import uk.org.ponder.rsf.components.UIContainer;
import uk.org.ponder.rsf.components.UIInternalLink;
import uk.org.ponder.rsf.components.UILink;
import uk.org.ponder.rsf.components.UIMessage;
import uk.org.ponder.rsf.components.UIOutput;
import uk.org.ponder.rsf.view.ComponentChecker;
import uk.org.ponder.rsf.view.DefaultView;
import uk.org.ponder.rsf.view.ViewComponentProducer;
import uk.org.ponder.rsf.viewstate.SimpleViewParameters;
import uk.org.ponder.rsf.viewstate.ViewParameters;
import za.co.davidhorwitz.stl.api.logic.STLLogic;
import za.co.davidhorwitz.stl.api.model.STLPhoto;
import za.co.davidhorwitz.stl.api.model.STLTest;
import za.co.davidhorwitz.stl.renderers.NavBarRenderer;

public class MainViewProducer  implements ViewComponentProducer, DefaultView{

	private static Logger log = LoggerFactory.getLogger(MainViewProducer.class);
	public static final String VIEW_ID = "Index";
	
	private MessageLocator messageLocator;
	public void setMessageLocator(MessageLocator messageLocator) {
		this.messageLocator = messageLocator;
	}
	
	private STLLogic stlLogic;
	public void setStlLogic(STLLogic stlLogic) {
		this.stlLogic = stlLogic;
	}
	
	private NavBarRenderer navBarRenderer;
	public void setNavBarRenderer(NavBarRenderer navBarRenderer) {
		this.navBarRenderer = navBarRenderer;
	}


	@Override
	public void fillComponents(UIContainer tofill, ViewParameters viewparams, ComponentChecker checker) {
	
		log.debug("OK!");
		STLTest test = stlLogic.getTestAndUser();
		log.debug("test: " + test.toString());
		//log.info(UIMessage.make("previous"));
		log.debug(stlLogic.getUser().toString());
		
		navBarRenderer.makeNavBar(tofill, "navIntraTool:", VIEW_ID);
		
	
		
		STLPhoto photo = stlLogic.getSTLPhoto();
		
		
		log.debug("photo: " + photo.getId() + " " + photo.getText());
		String photoLing = stlLogic.getPhotoContent() + photo.getId().toString() + ".jpg";
		UILink.make(tofill, "photo", photoLing);
		
		UIOutput.make(tofill, "text", photo.getText() + " " + getText(photo.getaThis()),  photo.getText());
		
		UIMessage.make(tofill, "previous1", "img_previous");
		UIMessage.make(tofill, "next1", "img_next");
		UIOutput.make(tofill, "cont", test.getMath() + "/" + test.getPess());
		
		
	}

	
	@Override
	public String getViewID() {
		return VIEW_ID;
	}
	private String getText(String t) {
		String text = t;
		int i = text.length();
		int q = 1;
		 log.debug("text: " + i);
		 
		String c = new String("_");
		while (i != q) {
			c = c.concat("_");
			q++;
		}
		return c;
	}
}
