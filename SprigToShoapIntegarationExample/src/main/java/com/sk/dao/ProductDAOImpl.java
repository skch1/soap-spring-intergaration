package com.sk.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.sk.domain.Product;
public class ProductDAOImpl implements ProductDAO {
	private static final String SQLQUERY = "insert into product values(?,?,?)";
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int resiterProduct(Product prouct) {
		int count = jt.update(SQLQUERY, prouct.getPid(), prouct.getName(), prouct.getPrice());
		return count;
	}

}
