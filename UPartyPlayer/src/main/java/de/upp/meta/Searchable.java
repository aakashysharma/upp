package de.upp.meta;

/**Interface that is used for tracks to get information and to compare Tracks
 * @author aakash
 *
 */
public interface Searchable {
	/**
	 * Compares if the track is same as the other one
	 * @param otherTrack
	 * @return true if same
	 */
	boolean isSameAs(Searchable otherTrack);
	/**
	 * Compares genre of two different tracks
	 * rock is same as alternative rock
	 * @param otherTrack
	 * @return true if same/similar
	 */
	boolean isOfSameGenre(Searchable otherTrack);
	/**
	 * Checks whether a track fits a particular range
	 * @param startYear
	 * @param endYear
	 * @return true if it fits
	 */
	boolean isOfThePeriod(int startYear, int endYear);
	/**
	 * Checks whether a song is of slow beats or not
	 * @return true if it is
	 */
	boolean isSlowSong();	
	
	/**
	 * Gets similar song
	 * @return similar song which could be played
	 */
	Searchable getSimilarSong();
	
	
	

}
