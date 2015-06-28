package de.upp.player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.upp.meta.Genre;
import de.upp.meta.TrackMetaInfo;

public class TrackHistoryManager {
	TrackHistoryManager manager = null;
	private List<TrackMetaInfo> tracksPlayedSoFar = null;
	private Map<Genre, Double> genreScore = null;

	TrackHistoryManager() {
		genreScore = new HashMap<Genre, Double>();
		tracksPlayedSoFar = new ArrayList<TrackMetaInfo>();
		// Initializing HashMap
		for (Genre genre : Genre.values()) {
			genreScore.put(genre, 0.0d);
		}
	}

	//Singleton
	public TrackHistoryManager getInstance() {
		if (manager == null) {
			manager = new TrackHistoryManager();
		}
		return manager;

	}

	//Adds track, updates score
	public void addToHistory(TrackMetaInfo track, Double trackScore) {
		tracksPlayedSoFar.add(track);
		//Formula to update score based on Track's genre and trackScore
		Genre trackGenre = track.getGenre();
		Double oldScore= this.genreScore.get(trackGenre);
		//TODO derive a new way to maintain score.
		Double newSccore = oldScore * trackScore / 100;
		
		this.genreScore.put(trackGenre, newSccore);
		
	}

}
