/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Владислав
 */
public class SimpleDish implements Dish{

    @Override
    public String getDescribtion() {
       return "Нордское рагу";
    }

    @Override
    public double getCost() {
        return 50;
    }
    
}
