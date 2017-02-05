package za.co.davidhorwitz.stl.api.logic;

import java.util.List;

import za.co.davidhorwitz.stl.api.model.STLPhoto;

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
}
