package com.eweather.mappers;

import com.eweather.entity.Clouds;

/**
 * That class has the responsibility to map the 
 * values of  @com.eweather.entity.Clouds to @com.eweather.info.Clouds
 */
public class CloudsInfoToCloudsEnityMapper {

	public Clouds apply (com.eweather.info.Clouds cloudsInfo) {
		com.eweather.entity.Clouds clouds = new com.eweather.entity.Clouds();
		clouds.setAll(cloudsInfo.getAll());
		return clouds;
	}
}
