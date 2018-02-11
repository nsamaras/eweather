package com.eweather.mappers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.eweather.common.info.CoordInfo;
import com.eweather.entity.Coord;
import com.eweather.weather.mappers.CoordInfoToCoordEnityMapper;

public class CoordInfoToCoordEnityMapperTest {

	@Test
	public void applyTest() {
		CoordInfoToCoordEnityMapper mapper = new CoordInfoToCoordEnityMapper();
		CoordInfo coordInfo =  new CoordInfo();
		coordInfo.setLat(1.1);
		coordInfo.setLon(1.2);
		Coord coord = mapper.apply(coordInfo);
		
		assertEquals(Double.valueOf(1.1), coord.getLat());
		assertEquals(Double.valueOf(1.2), coord.getLon());
	}
}
