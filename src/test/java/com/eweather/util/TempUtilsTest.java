package com.eweather.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;

import org.junit.Test;

import com.eweather.utils.TempUtils;
import com.eweather.weather.info.EweatherInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TempUtilsTest {

	@Test
	public void testGetWeatherForCities() throws MalformedURLException, IOException {
		TempUtils util = new TempUtils();
		String result = util.getWeatherForCities("http://api.openweathermap.org/data/2.5/group", 
				"2c48c02c54482ea955d6414942572809", Arrays.asList("735914"));
		assertTrue(result.contains("Katerini"));
	}
	
	@Test
	public void testGetWeatherForCitiesCount() throws MalformedURLException, IOException {
		TempUtils util = new TempUtils();
		String json = util.getWeatherForCities("http://api.openweathermap.org/data/2.5/group", 
				"2c48c02c54482ea955d6414942572809", Arrays.asList("735914", "734077", "264371"));
		
		ObjectMapper mapper = new ObjectMapper();
		EweatherInfo eweather = mapper.readValue(json, EweatherInfo.class);
		
		assertEquals(Integer.valueOf(3), eweather.getCnt());
	}
	
	@Test
	public void	testGetWeatherForCitiesMalformedException() {
		TempUtils util = new TempUtils();
		boolean result = false;
		try {
			 util.getWeatherForCities("xttp://api.openweathermap.org/data/2.5/group", 
					"2c48c02c54482ea955d6414942572809", Arrays.asList("735914", "734077", "264371"));
		} catch (MalformedURLException  e1) {
			result = true;
		} catch (IOException e2) {
			result = false;
		}
		assertTrue(result);
	}
}
