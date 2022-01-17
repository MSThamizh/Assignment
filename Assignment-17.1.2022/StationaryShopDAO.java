package com.tf.jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashSet;

import com.tf.jdbc.StationaryShopDTO;

import org.h2.jdbc.JdbcPreparedStatement;

public class StationaryShopDAO {

	LinkedHashSet<StationaryShopDTO> dto = new LinkedHashSet<>();

	StationaryShopDTO dto = new StationaryShopDTO();

	public void createTable(Connection connection) {
		String createTable = dto.getCreateTableQuery();
		
		try (Statement statement = connection.createStatement();){
			
			statement.execute(createTable);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertIntoTable(Connection connection,String name, String type, String brandName, double price, int quantity, int serialNo) {
		String insertDataQuery = dto.getInsertDataQuery();

		try (PreparedStatement preparedStatement = connection.prepareStatement(insertDataQuery);) {

			preparedStatement.setString(1, name);
			preparedStatement.setString(2, type);
			preparedStatement.setDouble(3, brandName);
			preparedStatement.setString(4, price);
			preparedStatement.setBoolean(5, quantity);
			preparedStatement.setBoolean(6, serialNo);
			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updatePriceByBrand(Connection connection, double price, String brandName) {
		String updatePriceByBrand = dto.getPriceByBrand();
		try (PreparedStatement preparedStatement = connection.prepareStatement(updatePriceByBrand);) {

			preparedStatement.setDouble(1, price);
			preparedStatement.setString(2, brandName);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

	public void deleteBySerialNo(Connection connection, int serialNo) {
		String deleteBySerialNo = dto.getdeleteBySerialNo();
		try (PreparedStatement preparedStatement = connection.prepareStatement(deleteBySerialNo);) {

			preparedStatement.setInt(1, serialNo);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void getAll(Connection connection) {
		PreparedStatement pstmt=null;
		ResultSet resultSet=null;
		try {
			 pstmt=connection.prepareStatement(getall);
			 resultSet=pstmt.executeQuery();
		while(resultSet.next()) {
			System.out.println("Name: " + resultSet.getString("name"));
			System.out.println("Type: " + resultSet.getString("type"));
			System.out.println("Brand: " + resultSet.getString("brandName"));
			System.out.println("Price : " + resultSet.getDouble("price"));
			System.out.println("Quantity: " + resultSet.getInt("quantity"));
			System.out.println("SerialNo: " + resultSet.getInt("serialNo"));
		}}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (resultSet !=null)
				    resultSet.close();
				if (pstmt !=null)
				    pstmt.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void getAllbyName(Connection connection, String name) {
		String query = "SELECT *  FROM StationaryShop WHERE name=?";
		PreparedStatement pstmt=null;
		ResultSet resultSet=null;
		try {
			 pstmt=connection.prepareStatement(getall);
			 pstmt.setName(1, name);
			 resultSet=pstmt.executeQuery();
		while(resultSet.next()) {
			System.out.println("Name: " + resultSet.getString("name"));
			System.out.println("Type: " + resultSet.getString("type"));
			System.out.println("Brand: " + resultSet.getString("brandName"));
			System.out.println("Price : " + resultSet.getDouble("price"));
			System.out.println("Quantity: " + resultSet.getInt("quantity"));
			System.out.println("SerialNo: " + resultSet.getInt("serialNo"));
		}}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (resultSet !=null)
				    resultSet.close();
				if (pstmt !=null)
				    pstmt.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
	

	




