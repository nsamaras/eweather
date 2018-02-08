package com.eweather.app;

import com.eweather.service.EweatherServiceImpl;

public class Main {

	public static void main(String[] args) {
		EweatherServiceImpl service = new EweatherServiceImpl();
		service.saveCoord();

	}

}
