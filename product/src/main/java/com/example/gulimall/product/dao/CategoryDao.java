package com.example.gulimall.product.dao;

import com.example.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author unicorn
 * @email ${email}
 * @date 2022-11-10 14:38:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
