/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

/**
 *
 * @author ebers
 */
public class Main {
     public static void main(String[] args) {
        // Crear un menú
        Menu menu = new Menu();
        menu.agregarItem("Hamburguesa", 10.99);
        menu.agregarItem("Pizza", 8.99);
        menu.agregarItem("Ensalada", 5.99);

        // Crear un pedido
        Pedido pedido = new Pedido();

        // Agregar ítems al pedido
        pedido.agregarItem(new Item("Hamburguesa", 2, menu.getPrecio("Hamburguesa")));
        pedido.agregarItem(new Item("Pizza", 1, menu.getPrecio("Pizza")));

        // Confirmar el pedido
        pedido.confirmarPedido();
    }
}
