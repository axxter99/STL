package za.co.davidhorwitz.stl.impl;

import java.util.ArrayList;
import java.util.List;

import org.sakaiproject.entitybroker.DeveloperHelperService;
import org.sakaiproject.memory.api.Cache;
import org.sakaiproject.memory.api.MemoryService;
import org.sakaiproject.user.api.User;
import org.sakaiproject.user.api.UserDirectoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import za.co.davidhorwitz.stl.api.logic.STLLogic;
import za.co.davidhorwitz.stl.api.model.STLCategories;
import za.co.davidhorwitz.stl.api.model.STLPhoto;
import za.co.davidhorwitz.stl.api.model.STLTest;
import za.co.davidhorwitz.stl.api.model.STLUser;

public class SakaiSTLLogic implements STLLogic {
	private static Logger log = LoggerFactory.getLogger(SakaiSTLLogic.class);
	
	
	/**
	 * Cache for site lookups
	 */
	protected Cache<String, STLTest> testCache = null;
	
	/** Dependency: MemoryService. */
	protected MemoryService memoryService = null;
	
	/**
	 * Dependency: MemoryService.
	 * 
	 * @param service
	 *        The MemoryService.
	 */
	public void setMemoryService(MemoryService service)
	{
		memoryService = service;
	}
	private DeveloperHelperService developerHelperService;

	public void setDeveloperHelperService(DeveloperHelperService developerHelperService) {
		this.developerHelperService = developerHelperService;
	}
	
	private UserDirectoryService userDirectoryService;
	
	public void setUserDirectoryService(UserDirectoryService userDirectoryService) {
		this.userDirectoryService = userDirectoryService;
	}
	public void init() {
		log.info("init()");
		//Chach
		testCache = memoryService.getCache("za.co.davidhorwitz.stl.impl.testCache");
	}
	@Override
	public STLPhoto getSTLPhoto() {

		// TODO
		List<STLPhoto> photo = setPhoto();
		log.debug("List photo: " + photo.size() );
		return photo.get(0);
	}

	@Override
	public List<STLPhoto> getListSTLPhoto() {
	
		
		return setPhoto();
	}
	@Override
	public String getPhotoContent() {
		String s = "../images/content/";
		return s;
	}

	private List<STLPhoto> setPhoto() {
		List<STLPhoto> photo = new ArrayList<>();
		
		STLCategories categories = new STLCategories();
		categories.setId(new Long(1));
		categories.setCategories("Animals");
		
		STLCategories food = new STLCategories();
		food.setId(new Long(1));
		food.setCategories("Animals");
		
		
		
		//Photo
		STLPhoto photo1 = new STLPhoto();
		photo1.setId(new Long(1));
		photo1.setText("This in a ");
		photo1.setaThis("lion");
		photo1.setCategories(categories);
		photo.add(photo1);
		
		STLPhoto dog = new STLPhoto();
		dog.setId(new Long(2));
		dog.setText("This in a ");
		dog.setaThis("dog");
		dog.setCategories(categories);
		photo.add(dog);
		
		STLPhoto photo2 = new STLPhoto();
		photo2.setId(new Long(3));
		photo2.setText("This is a picture of of ");
		photo2.setaThis("giraffe");
		photo2.setCategories(categories);
		photo2.setHeigh(true);
		photo.add(photo2);
		
		STLPhoto photo3 = new STLPhoto();
		photo3.setId(new Long(4));
		photo3.setText("This is a picture of of ");
		photo3.setaThis("Milkshake");
		photo3.setCategories(food);
		photo3.setHeigh(true);
		photo.add(photo3);
		
		log.debug("photo size: " + photo.size());
		
		return photo;
	}
	@Override
	public STLUser getUser() {
		
		User u = userDirectoryService.getCurrentUser();
		STLUser user = new STLUser();
		user.setId(u.getId());
		user.setEid(u.getEid());
		user.setFirstName(u.getFirstName());
		user.setLastName(u.getLastName());
		user.setDisplayName(u.getDisplayName());
		return user;
	}
	
	@Override
	public STLTest getTestAndUser() {
		STLUser u = getUser();
		STLTest t = testCache.get(u.getId());
		if (t == null) {
			t = new STLTest();
			t.setId(new Long(1));
			t.setUserId(u.getId());
			List<STLPhoto> listPhoto = getListSTLPhoto();
			t.setPhoto(listPhoto);
			t.setPess(listPhoto.size());
			
			t.setMath(1);
			testCache.put(t.getUserId(), t);
		}
		return t;
	}
}
