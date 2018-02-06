package com.eweather.jason2bean.mappers;

import java.util.function.Function;

import com.eweather.bean.Coord;
import com.eweather.entity.CoordEntity;

public class CoordBean2CoordEntity implements Function<Coord, CoordEntity> {

	@Override
	public CoordEntity apply(Coord coord) {
		CoordEntity coordEntity = new CoordEntity();
		coordEntity.setLat(coord.getLat());
		coordEntity.setLon(coord.getLon());
		return coordEntity;
	}

}
