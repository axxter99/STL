package za.co.davidhorwitz.stl.api.logic;

import java.util.List;

import org.sakaiproject.tool.api.ToolSession;

public interface ExternalLogic {
	
	/**
	 * Get a list of the permission keys for the tool
	 * @return
	 */
	public List<String> getPermissionKeys();
	
	/**
	 * Needed to invoke helper tools
	 */
	public ToolSession getCurrentToolSession();

}
