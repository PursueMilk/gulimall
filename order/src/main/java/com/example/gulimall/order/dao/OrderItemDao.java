package com.example.gulimall.order.dao;

import com.example.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author unicorn
 * @email ${email}
 * @date 2022-11-11 09:33:58
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
