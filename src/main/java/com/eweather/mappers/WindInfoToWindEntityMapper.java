package com.eweather.mappers;

import com.eweather.entity.Wind;
import com.eweather.info.WindInfo;

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
