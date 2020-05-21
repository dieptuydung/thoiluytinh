package vn.edu.ntu.tuydung.controller;

import android.app.Application;

import java.util.ArrayList;

import vn.edu.ntu.tuydung.model.Product;

public class CartController extends Application implements ICartController {
    ArrayList<Product> listProduct = new ArrayList<>();

    public CartController() {
        listProduct.add(new Product( "Xoài cát", 60000, "Xoài cát Hòa Lộc"));
        listProduct.add(new Product( "Bưởi", 50000, "Bưởi Năm Roi"));
        listProduct.add(new Product( "Thanh Long", 40000, "Thanh long không hạt"));
        listProduct.add(new Product( "Sầu riêng", 80000, "Sầu riêng Khánh sơn"));
        listProduct.add(new Product( "ổi ", 30000, "Ổi ruột hồng"));
        listProduct.add(new Product( "Vải ", 50000, "Vải Tiến Vua"));

    }

    @Override
    public ArrayList<Product> getListProduct() {
        return listProduct;

    }
}
