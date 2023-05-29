package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		/*
		Connection conn = DB.getConnection();
		DB.closeConnection();
		*/
		
		Department obj = new Department(2, "Pac");
		Seller seller = new Seller(1, "Jeff", "punkjeff@gmail.com", new Date(), 2500.0, obj);
		
		System.out.println(seller.toString());
	}

}
