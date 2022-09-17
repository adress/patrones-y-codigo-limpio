package org.example.factories;

import org.example.buttons.Button;
import org.example.buttons.WinButton;
import org.example.checkboxes.Checkbox;
import org.example.checkboxes.WinCheckbox;

// Las fábricas concretas producen una familia de productos que
// pertenecen a una única variante. La fábrica garantiza que los
// productos resultantes sean compatibles. Las firmas de los
// métodos de las fábricas concretas devuelven un producto
// abstracto mientras que dentro del método se instancia un
// producto concreto.

// Cada fábrica concreta tiene una variante de producto
// correspondiente.
public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
