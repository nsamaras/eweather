package com.eweather.mappers;

import com.eweather.entity.Coord;

/**
 * That class has the responsibility to map the 
 * values of  @com.eweather.entity.Coord to @com.eweather.entity.Coord
 */
public class CoordInfoToCoordEnityMapper {

	public Coord apply (com.eweather.info.Coord coordInfo) {
		com.eweather.entity.Coord coord = new com.eweather.entity.Coord();
		coord.setLat(coordInfo.getLat());
		coord.setLon(coordInfo.getLon());
		return coord;
	}
}
