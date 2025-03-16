/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thh.saleapp;

import com.thh.repositories.impl.CategoryRepositoryImpl;

/**
 *
 * @author admin
 */
public class Saleapp {

    public static void main(String[] args) {
        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
        s.getCates().forEach(c -> System.out.println(c.getName()));
    }
}
