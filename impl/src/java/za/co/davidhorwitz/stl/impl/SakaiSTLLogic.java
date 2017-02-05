package za.co.davidhorwitz.stl.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import za.co.davidhorwitz.stl.api.logic.STLLogic;
import za.co.davidhorwitz.stl.api.model.STLPhoto;

public class SakaiSTLLogic implements STLLogic {
	private static Logger log = LoggerFactory.getLogger(SakaiSTLLogic.class);
	
	public void init() {
		log.info("init()");
	}
	@Override
	public STLPhoto getSTLPhoto() {

		// TODO
		STLPhoto photo = new STLPhoto();
		photo.setId(new Long(1));
		photo.setText("This in a ");
		log.debug("photo: " + photo.getId());
		return photo;
	}

	@Override
	public List<STLPhoto> getListSTLPhoto() {
		List<STLPhoto> l = new ArrayList<>();
		l.add(getSTLPhoto());
		
		STLPhoto twe = new STLPhoto();
		twe.setId(new Long(2));
		twe.setText("This in a ");
		l.add(twe);
		log.debug("photo size: " + l.size());
		
		return l;
	}

}
