package com.eweather.weather.mappers;

import com.eweather.common.info.WindInfo;
import com.eweather.entity.Wind;

/**
 * That class has the responsibility to map the 
 * @WindInfo to @Wind
 */
public class WindInfoToWindEntityMapper {

	public Wind apply(WindInfo windInfo) {
		Wind wind = new Wind();
		wind.setDeg(windInfo.getDeg());
		wind.setSpeed(windInfo.getSpeed());
		wind.setGust(windInfo.getGust());
		return wind;
	}
}
