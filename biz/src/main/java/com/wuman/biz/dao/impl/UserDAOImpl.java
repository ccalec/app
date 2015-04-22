package com.wuman.biz.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wuman.biz.dao.BaseDAO;
import com.wuman.biz.dao.UserDAO;
import com.wuman.biz.domain.UserQuery;
import com.wuman.biz.pojo.UserDO;

@SuppressWarnings("deprecation")
@Repository("userDAO")
public class UserDAOImpl extends BaseDAO implements UserDAO {

	@Override
	public int updateUserDO(UserDO userDO) {
		return getSqlMapClientTemplate().update("users.updateUserDO", userDO);
	}

	@Override
	public UserDO getSingleUser(UserQuery query) {
		return (UserDO) getSqlMapClientTemplate().queryForObject("users.getSingleUser", query);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserDO> getUsers(UserQuery query) {
		return (List<UserDO>)getSqlMapClientTemplate().queryForList("users.getUsersByUserActive", query);
	}
	
}
