package za.co.davidhorwitz.stl.imp;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import za.co.davidhorwitz.stl.api.logic.STLLogic;
import za.co.davidhorwitz.stl.api.model.STLPhoto;

public class SakaiSTLLogic implements STLLogic {

	@Override
	public STLPhoto getSTLPhoto() {

		// TODO
		STLPhoto photo = new STLPhoto();
		photo.setId(new Long(1));
		photo.setText("This in a ");
		// TODO Auto-generated method stub
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
		
		
		return l;
	}

}
