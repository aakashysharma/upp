package de.upp.meta;

import java.sql.Time;

/**
 * Class that contains meta information about tracks.
 * Stores one track's meta information per Object
 * An album would have more than one such objects
 * 
 * @author aakash
 *
 */
public class TrackMetaInfo implements Searchable{
	
	private String trackID;
	private String trackName;
	private TrackArtist trackArtist;
	private Time playBackTime;
	private int yearOfRelease;
	private String genre; 
	
	
	
	

	@Override
	public boolean isSameAs(Searchable otherTrack) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOfSameGenre(Searchable otherTrack) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOfThePeriod(int startYear, int endYear) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSlowSong() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Searchable getSimilarSong() {
		// TODO Auto-generated method stub
		return null;
	}

}
