/**
 * 
 */
package de.upp.meta;

/**Class that contains information about Track Artists.
 * This could be a band and/or singer
 * @author aakash
 *
 */
public class TrackArtist implements Plays{
	private String artistName="";
	private String bandName="";
	

	@Override
	public boolean isSameAs(Plays otherArtist) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public String getArtistName() {
		
		return this.artistName;
	}


	@Override
	public String getBandName() {
		
		return this.bandName;
	}
	

}
