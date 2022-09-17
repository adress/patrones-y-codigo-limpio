package org.example;

import org.example.factory.Dialog;
import org.example.factory.WebDialog;
import org.example.factory.WindowsDialog;

public class Main {
    public static void main(String[] args) {
        Dialog dialog = null;

        // La aplicación elige un tipo de creador dependiendo de la
        // configuración actual o los ajustes del entorno.
        String opcion = "windows"; //html
        if (opcion.equals("windows")) {
            dialog = new WindowsDialog();
        }
        if (opcion.equals("html")) {
            dialog = new WebDialog();
        }

        dialog.render();
    }
}