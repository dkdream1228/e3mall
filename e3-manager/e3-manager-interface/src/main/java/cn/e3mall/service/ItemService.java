package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;

public interface ItemService {

	TbItem findById(long id) throws Exception;
}
