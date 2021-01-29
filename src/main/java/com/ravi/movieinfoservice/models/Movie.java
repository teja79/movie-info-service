package com.ravi.movieinfoservice.models;

public class Movie {
	
	private String movieId;
	private String info;
	public Movie(String movieId, String info) {
		super();
		this.movieId = movieId;
		this.info = info;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
}
