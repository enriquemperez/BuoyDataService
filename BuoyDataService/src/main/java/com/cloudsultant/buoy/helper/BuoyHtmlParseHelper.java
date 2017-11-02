package com.cloudsultant.buoy.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.cloudsultant.buoy.constants.Constants;
import com.cloudsultant.buoy.dto.BuoyDto;

public class BuoyHtmlParseHelper {

	public BuoyHtmlParseHelper() {
		super();
	}

	public BuoyDto parse(String stationId) throws Exception {
		BuoyDto dto = new BuoyDto(stationId);

		Document doc = Jsoup.connect(Constants.NOA_BUOY_URL + stationId).get();
		doc.select("td").forEach(System.out::println);
		Elements elements = doc.select("td");
		for( int i=0; i<elements.size(); i++)
		{
			if ( elements.get(i).text().equals("Wind Direction (WDIR):") )
			{
				dto.setWindDirection(elements.get(i+1).text());
			}
			else if ( elements.get(i).text().equals("Wind Speed (WSPD):") )
			{
				dto.setWindSpeed(elements.get(i+1).text());
			}
			else if ( elements.get(i).text().equals("Wave Height (WVHT):") )
			{
				dto.setWaveHeight(elements.get(i+1).text());
			}
			else if ( elements.get(i).text().equals("Dominant Wave Period (DPD):") )
			{
				dto.setDominantWavePeriod(elements.get(i+1).text());
			}
		}
		
		return dto;
	}

}
