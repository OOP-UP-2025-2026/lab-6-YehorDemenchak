package ua.opnu.draw;

import ua.opnu.draw.view.DrawFrame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Створення GUI в окремому потоці
        // Для ознайомлення з додатком, див. вміст класу DrawFrame
        SwingUtilities.invokeLater(() -> new DrawFrame("Програма Draw"));
    }
}