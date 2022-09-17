package org.example.factory;

import org.example.buttons.Button;
import org.example.buttons.HtmlButton;
import org.example.factory.Dialog;

// Los creadores concretos sobrescriben el método fábrica para
// cambiar el tipo de producto resultante.
public class WebDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
