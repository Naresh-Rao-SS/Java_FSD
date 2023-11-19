package com.mphasis.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mphasis.dbutil.DbUtil;
import com.mphasis.pojo.Product;

public class ProductDAO_Impl implements ProductDAO{

	@Override
	public int addProduct(Product product) throws ClassNotFoundException, SQLException {
		Connection conn=DbUtil.dbConn();
		if(conn!=null) {
			System.out.println("connected with db...");
		}
		Statement st=conn.createStatement();
		//insert into product values(1,'bag',2000);
		String sql="insert into product values("+product.getPid()+",'"+product.getPname()+"',"+product.getCost()+")";
		System.out.println(sql);
		//insert,update,delete ->executeUpdate(sql)->return will be count of no of rows
		return st.executeUpdate(sql);

	}

	@Override
	public int deleteProduct(int id) throws ClassNotFoundException, SQLException {
		Connection conn = DbUtil.dbConn();
		if (conn != null) {
			System.out.println("Connected with db...");
		}
		Statement st = conn.createStatement();
		String sql = "delete from product where pid = " + id;
		System.out.println(sql);
		return st.executeUpdate(sql);
	}


	@Override
	public int updateProductName(int id, String name) throws ClassNotFoundException, SQLException {
		Connection conn = DbUtil.dbConn();
		if (conn != null) {
			System.out.println("Connected with db...");
		}
		Statement st = conn.createStatement();
		String sql = "update product set pname = '" + name + "' where pid = " + id;
		System.out.println(sql);
		return st.executeUpdate(sql);
	}

	@Override
	public List<Product> selectProducts() throws ClassNotFoundException, SQLException {
		Connection conn=DbUtil.dbConn();
		if(conn!=null) {
			System.out.println("connected with db...");
		}
		Statement st=conn.createStatement();
		String sql="select * from product";
		System.out.println(sql);
		
		//select we use st.executeQuery
		ResultSet rs=st.executeQuery(sql);
		List<Product> list=new ArrayList<Product>();
		//it gets the base address of the table 
		
		while(rs.next()) {  //1st row of the table
			Product product=new Product();
			product.setPid(rs.getInt("pid"));
			product.setPname(rs.getString("pname"));
			product.setCost(rs.getInt("pcost"));
			list.add(product);
		}

		return list;

	}

}
