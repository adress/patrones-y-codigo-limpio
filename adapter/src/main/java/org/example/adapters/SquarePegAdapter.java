package org.example.adapters;

import org.example.round.RoundPeg;
import org.example.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 */
// Una clase adaptadora te permite encajar piezas cuadradas en
// hoyos redondos. Extiende la clase RoundPeg para permitir a
// los objetos adaptadores actuar como piezas redondas.
public class SquarePegAdapter extends RoundPeg {
    // En realidad, el adaptador contiene una instancia de la
    // clase SquarePeg.
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // El adaptador simula que es una pieza redonda con un
        // radio que pueda albergar la pieza cuadrada que el
        // adaptador envuelve.

        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}