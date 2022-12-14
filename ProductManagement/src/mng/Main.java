/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mng;

import data.*;

/**
 *
 * @author VU HONG ANH
 */
public class Main {

    public static void main(String[] agrs) {
        String[] options = {"Print all products", "Create a product", "Check exist product",
            "Search product information", "Update product", "Save to file", "Print product list from file"};
        Menu menu = new Menu(options);
        ProductList pList = new ProductList();
        pList.initWithFile();
        int choice = 0;
        do {
            System.out.println("---------------------------------------------------------------------------------------");
            choice = menu.getChoice("-------------------------------[PRODUCT MANAGER v3.0]----------------------------------");
            switch (choice) {
                case 1:
                    pList.printAllProduct();
                    break;
                case 2:
                    pList.addProduct();
                    break;
                case 3:
                    pList.checkExistProd();
                    break;
                case 4:
                    pList.searchProduct();
                    break;
                case 5:
                    pList.updateProduct();
                    break;
                case 6:
                    pList.writeToFile();
                    break;
                case 7:
                    pList.printFromFile();
                    break;
            }
        } while (choice > 0 && choice <= 7);
        
    }
}
