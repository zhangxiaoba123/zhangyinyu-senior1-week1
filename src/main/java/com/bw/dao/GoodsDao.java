package com.bw.dao;

import java.util.List;

import com.bw.domain.Goods;
import com.bw.domain.condition;

public interface GoodsDao {

	List<Goods> list(condition com);

	boolean add(Goods goods);

}
