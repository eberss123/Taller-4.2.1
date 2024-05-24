/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ebers
 */
public class Pedido {
    private List<Item> items;
    private boolean confirmado;

    public Pedido() {
        this.items = new ArrayList<>();
        this.confirmado = false;
    }

    public void agregarItem(Item item) {
        if (!confirmado) {
            items.add(item);
            System.out.println("Se ha agregado " + item.getCantidad() + " " + item.getNombre() + "(s) al pedido.");
        } else {
            System.out.println("No se pueden agregar más ítems al pedido confirmado.");
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrecio() * item.getCantidad();
        }
        return total;
    }

    public void confirmarPedido() {
        if (!items.isEmpty()) {
            confirmado = true;
            System.out.println("Pedido confirmado. Total a pagar: $" + calcularTotal());
        } else {
            System.out.println("No se puede confirmar un pedido vacío.");
        }
    }
}
