package com.eweather.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

import org.junit.Test;

import com.eweather.utils.TempUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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
				"2c48c02c54482ea955d6414942572809", Arrays.asList("735914"));
		Gson gson = new Gson();
		Test cnt = gson.fromJson(json, Test.class);
		
//		List<Test> list = gson.fromJson(json, new TypeToken<List<Test>>(){}.getType());
		
//		ObjectMapper mapper = new ObjectMapper();
//		Map<String, Object> map = mapper.readValue(result, Map.class);
//		mapper.readValue(result, Cnt.class);
		
		assertEquals(3, json);
	}
}
