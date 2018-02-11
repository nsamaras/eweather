package com.eweather.weather.mappers;

import com.eweather.common.info.CoordInfo;
import com.eweather.entity.Coord;

/**
 * That class has the responsibility to map the 
 * values of  @CoordInfo to @Coord
 */
public class CoordInfoToCoordEnityMapper {

	public Coord apply (CoordInfo coordInfo) {
		com.eweather.entity.Coord coord = new com.eweather.entity.Coord();
		coord.setLat(coordInfo.getLat());
		coord.setLon(coordInfo.getLon());
		return coord;
	}
}
