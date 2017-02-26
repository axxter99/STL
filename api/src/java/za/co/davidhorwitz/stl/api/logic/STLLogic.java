package za.co.davidhorwitz.stl.api.logic;

import java.util.List;

import za.co.davidhorwitz.stl.api.model.STLPhoto;
import za.co.davidhorwitz.stl.api.model.STLTest;
import za.co.davidhorwitz.stl.api.model.STLUser;

/**
 * @author dhorwitz
 *
 */
public interface STLLogic {

	
	/**
	 * @return
	 */
	public STLPhoto getSTLPhoto();
	
	public List<STLPhoto> getListSTLPhoto();
	
	public String getPhotoContent();
	
	public STLUser getUser();
	
	public STLTest getTestAndUser();
	
}
