package com.eweather.mappers;

import com.eweather.entity.Main;

/**
 * That class has the responsibility to map the 
 * @com.eweather.info.Main to @com.eweather.entity.Main
 */
public class MainInfoToMainEntityMapper {

	public Main apply (com.eweather.info.Main mainInfo) {
		com.eweather.entity.Main main = new com.eweather.entity.Main();
		main.setHumidity(mainInfo.getHumidity());
		main.setPressure(mainInfo.getPressure());
		main.setTemp(mainInfo.getTemp());
		main.setTemp_max(mainInfo.getTemp_max());
		main.setTemp_min(mainInfo.getTemp_min());
		return main;
	}
}
