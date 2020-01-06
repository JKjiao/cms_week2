package com.zhangjiaming.service;

import com.github.pagehelper.PageInfo;
import com.zhangjiaming.pojo.YearCheck;
import com.zhangjiaming.vo.YearCheckVO;

public interface YearCheckService {

	PageInfo<YearCheckVO> selectAll(Integer page,Integer pageSize,YearCheckVO yearCheckVO);
	
	YearCheck toUpdate(Integer id);
	
	int doCheck(YearCheck yearCheck) ;
}
