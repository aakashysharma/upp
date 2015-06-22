package de.upp.umundo;

import java.util.ArrayList;

import de.upp.meta.TrackArtist;

public class MusicPreference {
	
	private ArrayList<TrackArtist> favouriteArtists;
	private ArrayList<String> favouriteSongs;
	private ArrayList<String> favouriteGenre;
	
	
	public void addFavouriteGenre(String genre){
		if(favouriteGenre==null){
			favouriteGenre = new ArrayList<String>();
			
		}
		if(favouriteGenre.contains(genre)){// skip if already added
			return;
		}
		favouriteGenre.add(genre);
	}
	
	public void addFavouriteArtist(TrackArtist trackArtist){
		if(favouriteArtists==null){
			favouriteArtists = new ArrayList<TrackArtist>();
			
		}
		if(favouriteArtists.contains(trackArtist)){// skip if already added
			return;
		}
		favouriteArtists.add(trackArtist);
	}
	
	public void addFavouriteSong(String song){
		if(favouriteSongs==null){
			favouriteSongs = new ArrayList<String>();
			
		}
		if(favouriteSongs.contains(song)){// skip if already added
			return;
		}
		favouriteSongs.add(song);
	}

}
