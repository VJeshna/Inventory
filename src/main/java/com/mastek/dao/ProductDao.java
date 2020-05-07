package com.mastek.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mastek.model.Product;

@Component
public class ProductDao implements IDao<Product>{
	
	private JdbcTemplate jdbctemplate;
	@Autowired
	private ProductRowMapper rowmapper;
	
	public ProductDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public ProductDao(DataSource ds) {
		super();
		this.jdbctemplate = new JdbcTemplate(ds);
		this.rowmapper = new ProductRowMapper();
	}

	@Override
	public List<Product> findAll() {
		final String sql = "select * from products;";
		return jdbctemplate.query(sql, rowmapper);
	}

	@Override
	public Product findById(String id) {
		final String sql = "select * from products where product_id = ?;";
		return jdbctemplate.queryForObject(sql, new Object[] {id}, rowmapper);
	}

	@Override
	public boolean save(Product object) {
		final String sql = "insert into products values(?,?,?,?);";
//		JdbcTemplate.update(sql_stmt,Object ... args)
		return jdbctemplate.update(sql, object.getProdId(), object.getProdName(), object.getUnitPrice(), object.getAvailQty()) > 0;
	}

	@Override
	public boolean delete(String id) {
		final String sql = "delete from products where product_id=?;";
		return jdbctemplate.update(sql,id) > 0;
	}

}
