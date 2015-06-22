package de.upp.umundo;
/**
 * Class containing details about individual guests at a party
 * @author aakash
 *
 */
public class Guest {
	private String id; //preferably MAC address of device to identify user
	private MusicPreference preference;
	
	
	
	
	public Guest(String id) {
		super();
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public MusicPreference getPreference() {
		return preference;
	}
	public void setPreference(MusicPreference preference) {
		this.preference = preference;
	}
	

}
