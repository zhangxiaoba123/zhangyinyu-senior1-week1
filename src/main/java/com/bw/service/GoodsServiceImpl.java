package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.dao.GoodsDao;
import com.bw.domain.Goods;
import com.bw.domain.condition;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Resource
	private GoodsDao dao;

	@Override
	public List<Goods> list(condition com) {
		// TODO Auto-generated method stub
		return dao.list(com);
	}

	@Override
	public boolean add(Goods goods) {
		return dao.add(goods);
	}
}
