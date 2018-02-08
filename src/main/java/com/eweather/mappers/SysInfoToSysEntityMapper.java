package com.eweather.mappers;

import com.eweather.entity.Sys;
import com.eweather.info.SysInfo;

/**
 * That class has the responsibility to map the 
 * @SysInfo to @Sys
 */
public class SysInfoToSysEntityMapper {

	public Sys apply(SysInfo sysInfo) {
		Sys sys = new Sys();
		sys.setCountry(sysInfo.getCountry());
		sys.setMessage(sysInfo.getMessage());
		sys.setSunrise(sysInfo.getSunrise());
		sys.setSunset(sysInfo.getSunset());
		sys.setType(sysInfo.getType());
		return sys;
	}
}
