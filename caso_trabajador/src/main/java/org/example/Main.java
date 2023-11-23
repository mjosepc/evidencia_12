package org.example;

import ventanas.GUITrabajador;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUITrabajador guiTrabajador = new GUITrabajador();

            guiTrabajador.setVisible(true);
        });
    }
}
