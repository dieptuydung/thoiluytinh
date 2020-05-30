package vn.edu.ntu.tuydung.controller;

import java.util.ArrayList;

import vn.edu.ntu.tuydung.model.Product;

public interface ICartController {
    public ArrayList<Product> getListProduct();
    public boolean addToShopping(Product p);
    public ArrayList<Product>getds();
    public void clearShopping();
    public String getCartQuantity();

}
