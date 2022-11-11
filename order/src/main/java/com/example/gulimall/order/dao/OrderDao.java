package com.example.gulimall.order.dao;

import com.example.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author unicorn
 * @email ${email}
 * @date 2022-11-11 09:33:58
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
