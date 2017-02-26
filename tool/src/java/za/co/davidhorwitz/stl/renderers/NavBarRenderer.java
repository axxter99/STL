package za.co.davidhorwitz.stl.renderers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.org.ponder.rsf.components.UIContainer;
import uk.org.ponder.rsf.components.UIInternalLink;
import uk.org.ponder.rsf.components.UIJointContainer;
import uk.org.ponder.rsf.components.UIMessage;
import uk.org.ponder.rsf.viewstate.SimpleViewParameters;
import za.co.davidhorwitz.stl.producers.Setting;


public class NavBarRenderer {
	private static Logger log = LoggerFactory.getLogger(NavBarRenderer.class);
	
	public void makeNavBar(UIContainer tofill, String divID, String currentViewID){
	 log.info("navBar!");
	 UIJointContainer joint = new UIJointContainer(tofill, divID,"stl-navigation:");
	 UIInternalLink.make(joint, "Setting", UIMessage.make("admin_settings"), new SimpleViewParameters(Setting.VIEW_ID));
	}
}
