package com.eweather.mappers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.eweather.entity.Clouds;
import com.eweather.info.CloudsInfo;

public class CloudsInfoToCloudsEnityMapperTest {

	@Test
	public void applyTest() {
		CloudsInfoToCloudsEnityMapper mapper = new CloudsInfoToCloudsEnityMapper();
		CloudsInfo cloudsInfo =  new CloudsInfo();
		cloudsInfo.setAll(1);
		Clouds clouds = mapper.apply(cloudsInfo);
		
		assertEquals(Integer.valueOf(1), clouds.getAll());
	}
}
