package com.eweather.mappers;

import com.eweather.entity.Wind;

/**
 * That class has the responsibility to map the 
 * @com.eweather.info.Wind to @com.eweather.entity.Wind
 */
public class WindInfoToWindEntityMapper {

	public Wind apply(com.eweather.info.Wind windInfo) {
		Wind wind = new Wind();
		wind.setDeg(windInfo.getDeg());
		wind.setSpeed(windInfo.getSpeed());
		return wind;
	}
}
