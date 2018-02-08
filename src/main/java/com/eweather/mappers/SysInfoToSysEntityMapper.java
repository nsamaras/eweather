package com.eweather.mappers;

import com.eweather.entity.Sys;

/**
 * That class has the responsibility to map the 
 * @com.eweather.info.Sys to @com.eweather.entity.Sys
 */
public class SysInfoToSysEntityMapper {

	public Sys apply(com.eweather.info.Sys sysInfo) {
		Sys sys = new Sys();
		sys.setCountry(sysInfo.getCountry());
		sys.setMessage(sysInfo.getMessage());
		sys.setSunrise(sysInfo.getSunrise());
		sys.setSunset(sysInfo.getSunset());
		sys.setType(sysInfo.getType());
		return sys;
	}
}
