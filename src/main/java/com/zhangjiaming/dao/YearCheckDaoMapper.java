package com.zhangjiaming.dao;

import java.util.List;

import com.zhangjiaming.pojo.YearCheck;
import com.zhangjiaming.vo.YearCheckVO;

public interface YearCheckDaoMapper {

	List<YearCheckVO> selectAll(YearCheckVO yearCheckVO);
	
	YearCheck toUpdate(Integer id);
	
	int doCheck(YearCheck yearCheck) ;
}
