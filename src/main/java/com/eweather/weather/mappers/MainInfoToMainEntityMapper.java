package com.eweather.weather.mappers;

import com.eweather.entity.Main;
import com.eweather.weather.info.MainInfo;

/**
 * That class has the responsibility to map the 
 * @MainInfo to @Main
 */
public class MainInfoToMainEntityMapper {

	public Main apply (MainInfo mainInfo) {
		com.eweather.entity.Main main = new com.eweather.entity.Main();
		main.setHumidity(mainInfo.getHumidity());
		main.setPressure(mainInfo.getPressure());
		main.setTemp(mainInfo.getTemp());
		main.setTemp_max(mainInfo.getTemp_max());
		main.setTemp_min(mainInfo.getTemp_min());
		return main;
	}
}
