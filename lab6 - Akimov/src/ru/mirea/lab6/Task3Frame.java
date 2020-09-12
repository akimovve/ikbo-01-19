package ru.mirea.lab6;

import ru.mirea.lab6.data.TextColor;
import ru.mirea.lab6.data.TextFont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class Task3Frame extends JFrame {
    private JComboBox<String> colorBox;
    private JComboBox<String> fontBox;
    private JTextArea area;

    public Task3Frame() {
        init();
    }

    private void init() {
        initWindow();
        initComboBoxes();
        initMenus();
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

        getRootPane().setBorder(
                BorderFactory.createEmptyBorder(10, 10, 40, 10));
        setVisible(true);
    }

    private void initWindow() {
        setTitle("Task 3 - fonts & colors");
        setMaximumSize(new Dimension(700, 500));
        setMinimumSize(new Dimension(500, 400));
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComboBoxes() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        colorBox = new JComboBox<>();
        fontBox = new JComboBox<>();

        Arrays.stream(TextColor.values())
                .map(TextColor::obj)
                .forEach(colorBox::addItem);

        Arrays.stream(TextFont.values())
                .map(TextFont::obj)
                .forEach(fontBox::addItem);

        colorBox.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10));
        fontBox.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(colorBox, BorderLayout.EAST);
        panel.add(fontBox, BorderLayout.WEST);
        add(panel, BorderLayout.SOUTH);
    }

    private void initMenus() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fontMenu = new JMenu("Text font");
        JMenu colorMenu = new JMenu("Text color");

        for (TextFont font : TextFont.values()) {
            JMenuItem fontItem = new JMenuItem(font.obj());
            fontItem.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    super.mouseReleased(e);
                    setNewFont(font);
                }
            });
            fontMenu.add(fontItem);
        }
        for (TextColor color : TextColor.values()) {
            JMenuItem colorItem = new JMenuItem(color.obj());
            colorItem.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    super.mouseReleased(e);
                    setNewColor(color);
                }
            });
            colorMenu.add(colorItem);
        }
        menuBar.add(fontMenu);
        menuBar.add(colorMenu);
        add(menuBar);
        setJMenuBar(menuBar);
    }

    private void defaultTextStyle() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        area = new JTextArea();
        area.setFont(new Font(TextFont.TNR.obj(), Font.BOLD, 28));
        area.setForeground(TextColor.BLUE.color());
        panel.add(area, BorderLayout.CENTER);
        panel.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panel, BorderLayout.CENTER);
    }

    private void setNewFont(TextFont font) {
        area.setFont(font.font());
    }

    private void setNewColor(TextColor color) {
        area.setForeground(color.color());
    }
}
