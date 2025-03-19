/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Waiter;

/**
 *
 * @author Владислав
 */
public class Controller {
    private Waiter waiter = new Waiter();
    
    public Controller() {
        waiter.addDish();
}
}
