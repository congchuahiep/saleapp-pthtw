/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.thh.saleapp;

import com.thh.repositories.impl.CategoryRepositoryImpl;
import com.thh.repositories.impl.ProductRepositoryImpl;

/**
 *
 * @author admin
 */
public class Saleapp {

    public static void main(String[] args) {
        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
        s.getCates().forEach(c -> System.out.println(c.getName()));

        ProductRepositoryImpl s1 = new ProductRepositoryImpl();
        s1.getProducts(null)
                .forEach(p -> System.out.printf("%d - %s: %.1f\n",
                        p.getId(),
                        p.getName(),
                        p.getPrice()
                )
        );
    }
}
