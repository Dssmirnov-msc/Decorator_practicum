/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class Waiter {
    private ArrayList<Order> orders = new ArrayList<>();
    public Waiter (){
        
    }
    
    public void addDish(){
        Dish dish = new SimpleDish();
        Dish dish2 = new DeerDecorator(dish);
        Dish dish3 = new BreadDecorator(dish2);
        Dish dish4 = new SouceDecorator(dish3);
        Dish dish5 = new BerryDecorator(dish4);
        
        Order order = new Order(dish5.getDescribtion(), dish5.cost());
        orders.add(order);
        
    }
    
    public ArrayList<Order> getOrders(){
        return orders;
    }
}
