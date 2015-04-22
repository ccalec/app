package com.wuman.biz.dao;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.junit.Test;

import com.wuman.biz.domain.UserQuery;
import com.wuman.biz.pojo.UserDO;

public class UserDaoTest extends BaseDaoTest {
	@Resource
	private UserDAO userDAO;

	@Test
	public void test_getSingleUser() {
		UserQuery query = new UserQuery();
		query.setNick("yongl");
		UserDO userDO = userDAO.getSingleUser(query);
		System.out.println(userDO);
		Assert.assertTrue(userDO != null);
	}
}
