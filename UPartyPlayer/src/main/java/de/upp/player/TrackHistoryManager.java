package de.upp.player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.upp.meta.Genre;
import de.upp.meta.TrackMetaInfo;

public class TrackHistoryManager {
private List<TrackMetaInfo> tracksPlayedSoFar = null;
private Map<Genre,Double> genreScore = null;

public TrackHistoryManager() {
	genreScore = new HashMap<Genre, Double>();
	tracksPlayedSoFar = new ArrayList<TrackMetaInfo>();
	//Initializing HashMap
	for(Genre genre: Genre.values()){
		genreScore.put(genre, 0.0d);
	}
}
	
}
