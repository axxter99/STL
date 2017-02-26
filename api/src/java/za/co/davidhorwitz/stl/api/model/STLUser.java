package za.co.davidhorwitz.stl.api.model;



public class STLUser {


	/**
	 * The locale used to indicate the default locale
	 */
	public static final String DEFAULT_LOCALE = "default";
	
	private String eid;
	private String id;
	private String firstName;
	private String displayName;
	private String lastName;
	private String language;
	
	
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getEid() {
		
		return eid;
	}

	
	public String getFirstName() {
		
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return displayName;
	}

	
	public String getLanguage() {
		
		return language;
	}


	public void setEid(String eid) {
		this.eid = eid;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	@Override
	public String toString() {
		return "STLUser [eid=" + eid + ", id=" + id + ", firstName=" + firstName + ", displayName=" + displayName
				+ ", lastName=" + lastName + ", language=" + language + "]";
	}

}
