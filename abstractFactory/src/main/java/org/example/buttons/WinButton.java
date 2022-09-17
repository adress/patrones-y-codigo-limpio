package org.example.buttons;

// Los productos concretos son creados por las fábricas
// concretas correspondientes.
public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("Pintando un boton de Windows");
    }
}
