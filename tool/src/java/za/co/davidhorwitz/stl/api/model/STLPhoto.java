package za.co.davidhorwitz.stl.api.model;

public class STLPhoto {

	private String text;
	private Long id;
	

	/**
	 * @return
	 */
	public Long getId() {
		return id;
	}

	
	public void setText(String text) {
		this.text = text;
	}


	public void setId(Long i) {
		this.id = i;
	}


	public String getText() {
		return text;
	}

}
