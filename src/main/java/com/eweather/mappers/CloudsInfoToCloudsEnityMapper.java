package com.eweather.mappers;

import com.eweather.entity.Clouds;
import com.eweather.info.CloudsInfo;

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
