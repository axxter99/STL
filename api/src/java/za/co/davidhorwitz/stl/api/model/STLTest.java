package za.co.davidhorwitz.stl.api.model;

import java.util.List;

public class STLTest {

	@Override
	public String toString() {
		return "STLTest [NEW_PESS=" + NEW_PESS + ", id=" + id + ", userId=" + userId + ", photo=" + photo + ", math="
				+ math + ", pess=" + pess + "]";
	}
	public int NEW_PESS = 25;
	
	private Long id;
	private String userId;
	private List<STLPhoto> photo;
	private int math;
	private int pess;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public List<STLPhoto> getPhoto() {
		return photo;
	}
	public void setPhoto(List<STLPhoto> photo) {
		this.photo = photo;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getPess() {
		return pess;
	}
	public void setPess(int pess) {
		this.pess = pess;
	}

}
