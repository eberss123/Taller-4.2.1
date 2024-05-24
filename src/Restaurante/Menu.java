/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ebers
 */
public class Menu {
     private Map<String, Double> items;

    public Menu() {
        this.items = new HashMap<>();
    }

    public void agregarItem(String nombre, double precio) {
        items.put(nombre, precio);
    }

    public double getPrecio(String nombre) {
        return items.getOrDefault(nombre, 0.0);
    }
}
