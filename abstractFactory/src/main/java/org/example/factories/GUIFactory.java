package org.example.factories;

import org.example.buttons.Button;
import org.example.checkboxes.Checkbox;

// La interfaz fábrica abstracta declara un grupo de métodos que
// devuelven distintos productos abstractos. Estos productos se
// denominan familia y están relacionados por un tema o concepto
// de alto nivel. Normalmente, los productos de una familia
// pueden colaborar entre sí. Una familia de productos puede
// tener muchas variantes, pero los productos de una variante
// son incompatibles con los productos de otra.
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
