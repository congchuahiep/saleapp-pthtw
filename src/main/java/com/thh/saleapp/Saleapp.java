/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.thh.saleapp;

import com.thh.repositories.impl.CategoryRepositoryImpl;
import com.thh.repositories.impl.ProductRepositoryImpl;
import com.thh.repositories.impl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class Saleapp {

	public static void main(String[] args) {
		CategoryRepositoryImpl s = new CategoryRepositoryImpl();
		s.getCates().forEach(c -> System.out.println(c.getName()));

		ProductRepositoryImpl s1 = new ProductRepositoryImpl();
		s1.getProducts(null).forEach(
				p -> System.out.printf("%d - %s: %d\n",
						p.getId(),
						p.getName(),
						p.getPrice()));

		Map<String, String> param2 = new HashMap<>();
		param2.put("name", "Tab");
		ProductRepositoryImpl s2 = new ProductRepositoryImpl();
		s2.getProducts(param2).forEach(
				p -> System.out.printf("%d - %s: %d\n",
						p.getId(),
						p.getName(),
						p.getPrice()));

		System.out.println("\n\n------------------");
		StatsRepositoryImpl s3 = new StatsRepositoryImpl();
		s3.statsRevenueByProduct().forEach(
				o -> System.out.printf("%s - %s: %s\n", o[0], o[1], o[2]));
	}
}
