package com.flangs.www.service;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

import com.flangs.www.DAO.TestDAO;
import com.flangs.www.beans.TestBean;

@Service
public class TestServiceImpl implements TestService {

	@Inject
	private TestDAO dao;

	@Override
	public List<TestBean> test() throws Exception {
		return dao.test();

	}

}