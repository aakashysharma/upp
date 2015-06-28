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
	private Genre genre; 
	
	
	
	

	/**
	 * @return the trackID
	 */
	public String getTrackID() {
		return trackID;
	}

	/**
	 * @param trackID the trackID to set
	 */
	public void setTrackID(String trackID) {
		this.trackID = trackID;
	}

	/**
	 * @return the trackName
	 */
	public String getTrackName() {
		return trackName;
	}

	/**
	 * @param trackName the trackName to set
	 */
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	/**
	 * @return the trackArtist
	 */
	public TrackArtist getTrackArtist() {
		return trackArtist;
	}

	/**
	 * @param trackArtist the trackArtist to set
	 */
	public void setTrackArtist(TrackArtist trackArtist) {
		this.trackArtist = trackArtist;
	}

	/**
	 * @return the playBackTime
	 */
	public Time getPlayBackTime() {
		return playBackTime;
	}

	/**
	 * @param playBackTime the playBackTime to set
	 */
	public void setPlayBackTime(Time playBackTime) {
		this.playBackTime = playBackTime;
	}

	/**
	 * @return the yearOfRelease
	 */
	public int getYearOfRelease() {
		return yearOfRelease;
	}

	/**
	 * @param yearOfRelease the yearOfRelease to set
	 */
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	/**
	 * @return the genre
	 */
	public Genre getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

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
