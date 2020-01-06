package com.zhangjiaming.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zhangjiaming.pojo.YearCheck;
import com.zhangjiaming.service.YearCheckService;
import com.zhangjiaming.vo.YearCheckVO;

@Controller
public class YearCheckController {

	@Resource
	private YearCheckService yearCheckService;
	
	@RequestMapping("selectAll")
	public String selectAll(@RequestParam(defaultValue = "1")Integer page,
							@RequestParam(defaultValue = "3")Integer pageSize,
							YearCheckVO yearCheckVO,HttpSession session
							,Model model) {
		PageInfo<YearCheckVO> info = yearCheckService.selectAll(page, pageSize, yearCheckVO);
		model.addAttribute("info", info);
		model.addAttribute("vo", yearCheckVO);
		return "list";
	}
	
	@GetMapping("toCheck")
	public String toCheck(Integer id,Model model) {
		YearCheck yc = yearCheckService.toUpdate(id);
		model.addAttribute("yc", yc);
		return "check";
	}
	
	@PostMapping("doCheck")
	@ResponseBody
	public String doCheck(YearCheck yearCheck) {
		yearCheckService.doCheck(yearCheck);
		return "redirect:selectAll";
	}
}

