package com.etoak.mapper;

import java.util.List;

import com.etoak.bean.Dict;

public interface DictMapper {
	
	/* 根据groupId查询字典数据列表 */
	List<Dict> queryList(String groupId);

}
