package com.cloudsultant.buoy.dto;

public class BuoyDto {

	private String stationId;
	private String windDirection;
	private String windSpeed;
	private String waveHeight;
	private String dominantWavePeriod;

	public BuoyDto() {
		super();
	}
	public BuoyDto(String stationId) {
		super();
		this.stationId = stationId;
	}
	public BuoyDto(String stationId, String windDirection, String windSpeed, String waveHeight, String dominantWavePeriod) {
		super();
		this.stationId = stationId;
		this.windDirection = windDirection;
		this.windSpeed = windSpeed;
		this.waveHeight = waveHeight;
		this.dominantWavePeriod = dominantWavePeriod;
	}

	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	public String getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getWaveHeight() {
		return waveHeight;
	}

	public void setWaveHeight(String waveHeight) {
		this.waveHeight = waveHeight;
	}

	public String getDominantWavePeriod() {
		return dominantWavePeriod;
	}

	public void setDominantWavePeriod(String dominantWavePeriod) {
		this.dominantWavePeriod = dominantWavePeriod;
	}

	@Override
	public String toString() {
		return "Dto [stationId=" + stationId + ", windDirection=" + windDirection + ", windSpeed=" + windSpeed
				+ ", waveHeight=" + waveHeight + ", dominantWavePeriod=" + dominantWavePeriod + "]";
	}

	
}
