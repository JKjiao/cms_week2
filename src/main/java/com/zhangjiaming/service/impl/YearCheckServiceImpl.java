package com.zhangjiaming.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangjiaming.dao.YearCheckDaoMapper;
import com.zhangjiaming.pojo.YearCheck;
import com.zhangjiaming.service.YearCheckService;
import com.zhangjiaming.vo.YearCheckVO;

@Service
public class YearCheckServiceImpl implements YearCheckService {

	@Resource
	private YearCheckDaoMapper yearCheckDaoMapper;

	@Override
	public PageInfo<YearCheckVO> selectAll(Integer page, Integer pageSize, YearCheckVO yearCheckVO) {
		PageHelper.startPage(page,pageSize);
		List<YearCheckVO> list = yearCheckDaoMapper.selectAll(yearCheckVO);
		return new PageInfo<YearCheckVO>(list);
	}

	@Override
	public YearCheck toUpdate(Integer id) {
		return yearCheckDaoMapper.toUpdate(id);
	}

	@Override
	public int doCheck(YearCheck yearCheck) {
		return yearCheckDaoMapper.doCheck(yearCheck);
	}
	
	
}

