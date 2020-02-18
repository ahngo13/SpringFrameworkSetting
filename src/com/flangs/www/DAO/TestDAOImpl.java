package com.flangs.www.DAO;
import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.flangs.www.beans.TestBean;

@Repository
public class TestDAOImpl implements TestDAO {
	private static final String namespace="com.flangs.www.testMapper";

	@Inject
	private SqlSession sqlSession;

	@Override
	public List<TestBean> test() throws Exception{
		return sqlSession.selectList(namespace+".test");
	}
}