package za.co.davidhorwitz.stl.api.model;

public class STLPhoto {

	private String text;
	private Long id;
	private String aThis;
	private STLCategories categories;
	private boolean heigh;

	public boolean isHeigh() {
		return heigh;
	}


	public void setHeigh(boolean heigh) {
		this.heigh = heigh;
	}


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
	
	public String getThis() {
		return aThis;
	}


	public String getaThis() {
		return aThis;
	}


	public void setaThis(String aThis) {
		this.aThis = aThis;
	}


	public STLCategories getCategories() {
		return categories;
	}


	public void setCategories(STLCategories categories) {
		this.categories = categories;
	}

}
