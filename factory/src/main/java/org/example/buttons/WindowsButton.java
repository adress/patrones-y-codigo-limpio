package org.example.buttons;

// Los productos concretos proporcionan varias implementaciones
// de la interfaz de producto.
public class WindowsButton implements Button {
    public void render() {
        System.out.println("|WIN Button|");
    }

    public void onClick() {
        System.out.println("Windows Button onClick event added");
    }
}
