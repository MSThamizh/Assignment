package com.tf.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.tf.jdbc.StationaryShopDAO;
import com.tf.jdbc.StationaryShopDTO;

import org.h2.tools.Server;

public class StationaryShopMain {
	

	StationaryShopDTO dto= new StationaryShopDTO();
	
	 dto.setCreateTableQuery(
			 " CREATE StationaryShop"
						+ "(name varchar(25),type varchar(25),brandName varchar(25),price NUMBER(5,2),quantity int, serialNo int)";

			  dto.setInsertDataQuery("INSERT INTO StationaryShop VALUES (?,?,?,?,?,?)");
			  dto.setUpdatePriceByBrand("UPDATE StationaryShop SET price=? WHERE brand=?");
			  dto.setDeleteBySerialNo("DELETE FROM StationaryShop WHERE serailNo=?");
              dto.getall("SELECT * FROM StationaryShop");
              dto.getallByName("SELECT * FROM StationaryShop WHERE name=?");
			  

			  Connection connection = getConnection();

			  StationaryShopDAO dao = new StationaryShopDAO();

			  dao.createTable(connection);
			  dao.insertIntoTable(connection, "Pen", "Written", "Parker", 189.00, 2, 101);
			  dao.insertIntoTable(connection, "Pencil", "Written", "Apsara", 19.00, 5, 102);
			  dao.insertIntoTable(connection, "Note", "Written", "Classmate", 89.00, 1, 103);
			  dao.updatePrizeByBrand(connection, 29, "Apsara");
			  dao.deleteBySerialNo(connection, 102);
			  dao.getAll(connection);
			  dao.getAllbyName(connection,"Note");
			  
			  try {
			   Server.startWebServer(connection);
			  } catch (SQLException e) {
			   e.printStackTrace();
			  }
			
			 private static Connection getConnection() {
			  Connection con = null;
			  try {
			   con = DriverManager.getConnection("jdbc:h2:mem:Thoughtfocus", "sa", "sa");
			   if (con != null) {
			    System.out.println("Connection acquired successfully");
			   } else {
			    System.out.println("No connection established");
			   }

			  } catch (SQLException e) {
			   e.printStackTrace();
			  }

			  return con;
			 }
			}

	

