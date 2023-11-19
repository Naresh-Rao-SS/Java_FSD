package com.mphasis.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.mphasis.dao.ProductDAO_Impl;
import com.mphasis.dbutil.DbUtil;
import com.mphasis.pojo.Product;

public class DbMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		/*
		 * Connection con=DbUtil.dbConn(); if(con!=null) {
		 * System.out.println("dB connection is established successfully....");}
		 */
		Scanner sc=new Scanner(System.in);
		//working data
		ProductDAO_Impl dao=null;
		Product product=null;
		while(true) {
			System.out.println("Menu \n 1. add Product \n 2. delete product \n 3. update product \n 4. retrive product \n 5.exit");
			System.out.println("enter the choice ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:product=new Product();
			System.out.println("enter product id ");
			product.setPid(sc.nextInt());
			System.out.println("enter product name");
			product.setPname(sc.next());
			System.out.println("enter product cost");
			product.setCost(sc.nextInt());
			dao=new ProductDAO_Impl();
			if(dao.addProduct(product)>0) {
				System.out.println("product got inserted with details "+product);
			}
			break;


			case 2:
				dao = new ProductDAO_Impl();
				System.out.println("Enter product ID to delete: ");
				int deleteProductId = sc.nextInt();
				int deletedRows = dao.deleteProduct(deleteProductId);
				if (deletedRows > 0) {
					System.out.println("Product with ID " + deleteProductId + " has been deleted.");
				} else {
					System.out.println("No product found with ID " + deleteProductId);
				}
				break;


			case 3:
				dao = new ProductDAO_Impl();
				System.out.println("Enter product ID to update: ");
				int updateProductId = sc.nextInt();
				System.out.println("Enter new product name: ");
				String updatedProductName = sc.next();

				int updatedRows = dao.updateProductName(updateProductId, updatedProductName);
				if (updatedRows > 0) {
					System.out.println("Product with ID " + updateProductId + " has been updated.");
				} else {
					System.out.println("No product found with ID " + updateProductId);
				}
				break;


			case 4:  
				dao=new ProductDAO_Impl();
				List<Product> productlist=dao.selectProducts();
				for(Product products:productlist) {
					System.out.println(products);
				}
				break;


			case 5:System.exit(0);
			break;
			}


		}
	}
}


