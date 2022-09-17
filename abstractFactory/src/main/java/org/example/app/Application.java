package org.example.app;

import org.example.buttons.Button;
import org.example.checkboxes.Checkbox;
import org.example.factories.GUIFactory;

// El código cliente funciona con fábricas y productos
// únicamente a través de tipos abstractos: GUIFactory, Button y
// Checkbox. Esto te permite pasar cualquier subclase fábrica o
// producto al código cliente sin descomponerlo.
public class Application {
    private GUIFactory guiFactory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    public void createUI() {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();

    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
