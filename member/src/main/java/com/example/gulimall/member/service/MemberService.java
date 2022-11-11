package com.example.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author unicorn
 * @email ${email}
 * @date 2022-11-11 09:29:56
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

