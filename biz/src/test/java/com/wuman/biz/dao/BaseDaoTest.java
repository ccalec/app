package com.wuman.biz.dao;

import org.junit.Ignore;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

@Ignore
@ContextConfiguration(locations = { "classpath:test-applicationContext-dao.xml" })
@TransactionConfiguration(transactionManager = "transactionManager") 
public class BaseDaoTest extends AbstractTransactionalJUnit4SpringContextTests {

}
