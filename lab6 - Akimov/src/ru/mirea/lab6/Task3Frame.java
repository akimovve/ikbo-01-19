package ru.mirea.lab6;

import ru.mirea.lab6.data.TextColor;
import ru.mirea.lab6.data.TextFont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Task3Frame extends JFrame {
    private JComboBox<String> colorBox;
    private JComboBox<String> fontBox;
    private JTextArea area;

    public Task3Frame() {
        init();
    }

    private void init() {
        setTitle("Task 3 - fonts & colors");
        setMinimumSize(new Dimension(700, 500));
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initComboBoxes();
        defaultTextStyle();

        ActionListener colorListener = e -> {
            JComboBox<String> box = (JComboBox<String>) e.getSource();
            setNewColor(TextColor.fromObj((String) box.getSelectedItem()));
        };
        ActionListener fontListener = e -> {
            JComboBox<String> box = (JComboBox<String>) e.getSource();
            setNewFont(TextFont.fromObj((String) box.getSelectedItem()));
        };

        colorBox.addActionListener(colorListener);
        fontBox.addActionListener(fontListener);


        add(area, BorderLayout.CENTER);
        add(colorBox, BorderLayout.WEST);
        add(fontBox, BorderLayout.EAST);
        getRootPane().setBorder(
                BorderFactory.createEmptyBorder(40, 10, 40, 10));
        setVisible(true);
    }

    private void initComboBoxes() {
        colorBox = new JComboBox<>();
        fontBox = new JComboBox<>();

        Arrays.stream(TextColor.values())
                .map(TextColor::obj)
                .forEach(colorBox::addItem);

        Arrays.stream(TextFont.values())
                .map(TextFont::obj)
                .forEach(fontBox::addItem);
    }

    private void defaultTextStyle() {
        area = new JTextArea();
        area.setFont(new Font(TextFont.TNR.obj(), Font.BOLD, 28));
        area.setForeground(TextColor.BLUE.color());
    }

    private void setNewFont(TextFont font) {
        area.setFont(font.font());
    }

    private void setNewColor(TextColor color) {
        area.setForeground(color.color());
    }
}
