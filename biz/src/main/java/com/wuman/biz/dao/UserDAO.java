package com.wuman.biz.dao;

import java.util.List;

import com.wuman.biz.domain.UserQuery;
import com.wuman.biz.pojo.UserDO;

public interface UserDAO {
	/**
	 * 更新
	 * @param userDO
	 * @return
	 */
	public int updateUserDO(UserDO userDO);
	/**
	 * 根据nick or phone获取用户信息
	 * @param query
	 * @return
	 */
	public UserDO getSingleUser(UserQuery query);
	/**
	 * 根据类型返回会员，用于超级管理员
	 * @param query
	 * @return
	 */
	public List<UserDO> getUsers(UserQuery query);
}
