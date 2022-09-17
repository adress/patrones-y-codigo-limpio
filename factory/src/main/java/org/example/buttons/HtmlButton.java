package org.example.buttons;

// Los productos concretos proporcionan varias implementaciones
// de la interfaz de producto.
public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test Button</button>");
    }

    public void onClick() {
        System.out.println("HTML Button onClick event added");
    }
}