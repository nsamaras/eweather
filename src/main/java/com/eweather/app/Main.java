package com.eweather.app;

import java.io.IOException;
import java.net.MalformedURLException;

import com.eweather.controller.EweatherController;
import com.eweather.service.EweatherServiceImpl;

public class Main {

	public static void main(String[] args) throws MalformedURLException, IOException {
		/*EweatherServiceImpl service = new EweatherServiceImpl();
		service.saveCoord();*/
		
		new EweatherController().start();

	}

}
