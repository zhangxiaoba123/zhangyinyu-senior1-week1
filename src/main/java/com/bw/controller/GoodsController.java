package com.bw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.domain.Goods;
import com.bw.domain.condition;
import com.bw.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {

	@Resource
	private GoodsService service;
	
	@RequestMapping("selects")
	public String list(condition com,Model m) {
		if (com.getPageNum()==null) {
			com.setPageNum(1);
		}
		
		PageHelper.startPage(com.getPageNum(), 3);
		
		List<Goods> list=service.list(com);
		
		PageInfo<Goods> page=new PageInfo<Goods>(list);
		
		m.addAttribute("page", page);
		m.addAttribute("list", list);
		
		return "list";
		
	}
	
	@ResponseBody
	@RequestMapping("add")
	public Object add(Model m,Goods goods) {
		
		boolean flag=service.add(goods);
		
		
		return flag;
		
	}
}
