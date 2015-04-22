package com.wuman.biz.dao;

import org.springframework.dao.support.DaoSupport;
import org.springframework.orm.ibatis.SqlMapClientTemplate;

@SuppressWarnings("deprecation")
public class BaseDAO extends DaoSupport {

	
	protected SqlMapClientTemplate sqlMapClientTemplate;

	@Override
	protected void checkDaoConfig() throws IllegalArgumentException {
		this.sqlMapClientTemplate.afterPropertiesSet();
	}

	public SqlMapClientTemplate getSqlMapClientTemplate() {
		return sqlMapClientTemplate;
	}

	public void setSqlMapClientTemplate(SqlMapClientTemplate sqlMapClientTemplate) {
		this.sqlMapClientTemplate = sqlMapClientTemplate;
	}

}