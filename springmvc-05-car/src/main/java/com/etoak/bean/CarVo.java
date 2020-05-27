package com.etoak.bean;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarVo extends Car {
	//级别名称
	private String levelName;
	//变速箱名称
	private String gearboxName;
	//排量名称
	private String outputVolumeName;
	//传到sql的条件
	@JsonIgnore//spring mvc 在返回结果不封装被@JsonIgnore注解
	private List<Map<String,Integer>> priceMapList;
	//接受前端的车龄条件
	@JsonIgnore
	private String vehicleAge;
	//传到sql的条件
	@JsonIgnore
	private Integer startYear; 
	@JsonIgnore
	private Integer endYear; 
}
