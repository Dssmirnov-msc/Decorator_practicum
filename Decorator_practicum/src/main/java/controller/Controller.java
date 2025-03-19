/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Order;
import model.Waiter;

/**
 *
 * @author Владислав
 */
public class Controller {
    private Waiter waiter = new Waiter();
    
    public Controller() {
        new View(this);
}
    public void makeOrder(){
        waiter.addDish();
    }
    
    public ArrayList<Order> MakeTableOfOrders(){
        return waiter.getOrders();
    }
}
