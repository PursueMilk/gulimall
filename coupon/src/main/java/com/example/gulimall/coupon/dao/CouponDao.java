package com.example.gulimall.coupon.dao;

import com.example.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author unicorn
 * @email ${email}
 * @date 2022-11-11 09:23:59
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
