package za.co.davidhorwitz.stl.api;

/**
 * @author dhorwitz
 *
 */
public interface STLUser {

	/**
	 * Access the user's enterprise id; the id they and the enterprise know as belonging to them.<br />
	 * The Enterprise id, like the User id, is unique among all defined users.<br />
	 * The EID may be used by the user to login, and will be used when communicating with the user directory provider.
	 * 
	 * @return The user's enterprise id.
	 */
	public String getEid();
	
	/**
	 * Access the user's first name.
	 * 
	 * @return The user's first name.
	 */
	public String getFirstName();

	/**
	 * Access the user's last name.
	 * 
	 * @return The user's last name.
	 */
	public String getLastName();

	/**
	 * Access the user's name for display purposes.
	 * 
	 * @return The user's name for display purposes.
	 */
	public String getDisplayName();
	
	
	public String getLanguage();
	
	
}
