package org.example.factories;

import org.example.buttons.Button;
import org.example.buttons.MacButton;
import org.example.checkboxes.Checkbox;
import org.example.checkboxes.MacCheckbox;

// Las fábricas concretas producen una familia de productos que
// pertenecen a una única variante. La fábrica garantiza que los
// productos resultantes sean compatibles. Las firmas de los
// métodos de las fábricas concretas devuelven un producto
// abstracto mientras que dentro del método se instancia un
// producto concreto.

// Cada fábrica concreta tiene una variante de producto
// correspondiente.
public class MacFactory implements  GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
