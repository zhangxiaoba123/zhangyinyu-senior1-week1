package com.bw.service;

import java.util.List;

import com.bw.domain.Goods;
import com.bw.domain.condition;

public interface GoodsService {

	List<Goods> list(condition com);

	boolean add(Goods goods);

}
