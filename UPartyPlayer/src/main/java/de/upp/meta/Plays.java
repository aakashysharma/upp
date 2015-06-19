package de.upp.meta;

public interface Plays {
	/**
	 * Compares artist to another artist of a band.
	 * If artist was part of band, then it'll return true
	 * @param otherArtist
	 * @return true if similar
	 */
	boolean isSameAs(Plays otherArtist);
	
	String getArtistName();
	
	String getBandName();

}
