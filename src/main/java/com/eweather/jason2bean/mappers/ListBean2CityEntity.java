package com.eweather.jason2bean.mappers;

import java.util.function.Function;

import com.eweather.bean.List;
import com.eweather.entity.CityEntity;
import com.eweather.entity.CoordEntity;

public class ListBean2CityEntity implements Function<com.eweather.bean.List, CityEntity> {

	@Override
	public CityEntity apply(List bean) {
		CityEntity cityEntity = new CityEntity();
		cityEntity.setId(bean.getId());
		cityEntity.setName(bean.getName());
		cityEntity.setVisibility(bean.getVisibility());
		
		// map coord
		CoordBean2CoordEntity coord = new CoordBean2CoordEntity();
		CoordEntity coordEntity = coord.apply(bean.getCoord());
		cityEntity.setCoordEntity(coordEntity);
		
		return cityEntity;
	}


}
