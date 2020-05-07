package com.mastek.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mastek.model.Product;

@Component
public class ProductRowMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product p = new Product();
		p.setProdId(rs.getString("product_id"));
		p.setProdName(rs.getString("product_name"));
		p.setUnitPrice(rs.getDouble("unit_price"));
		p.setAvailQty(rs.getInt("available_quantity"));
		
		return p;
	}

}
