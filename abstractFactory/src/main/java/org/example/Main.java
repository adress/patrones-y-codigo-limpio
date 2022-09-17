package org.example;

import org.example.app.Application;
import org.example.factories.GUIFactory;
import org.example.factories.MacFactory;
import org.example.factories.WinFactory;

// La aplicación elige el tipo de fábrica dependiendo de la
// configuración actual o de los ajustes del entorno y la crea
// durante el tiempo de ejecución (normalmente en la etapa de
// inicialización).
public class Main {
    public static void main(String[] args) {
        GUIFactory factory = null;

        String opcion = "mac"; //windows

        if (opcion.equals("windows")) {
            factory = new WinFactory();
        }
        if (opcion.equals("mac")) {
            factory = new MacFactory();
        }
        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}