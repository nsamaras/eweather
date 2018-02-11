package com.eweather.weather.mappers;

import com.eweather.common.info.CloudsInfo;
import com.eweather.entity.Clouds;

/**
 * That class has the responsibility to map the 
 * values of  @CloudsInfo to @Clouds
 */
public class CloudsInfoToCloudsEnityMapper {

	public Clouds apply (CloudsInfo cloudsInfo) {
		com.eweather.entity.Clouds clouds = new com.eweather.entity.Clouds();
		clouds.setAll(cloudsInfo.getAll());
		return clouds;
	}
}
