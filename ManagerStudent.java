package Java.JavaSwing_ManageStudent.Controller;
import Java.JavaSwing_ManageStudent.Models.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ManagerStudent extends JFrame {
    private JTextField idField, nameField, mathField, englishField;
    private JButton addButton, editButton, delButton, searchButton; // chuc nang
    private JTable studenTable;
    private DefaultTableModel tableModel;

    private ArrayList<Student> studentist = new ArrayList<>();

    public StudentManagement() {
        setTitle("ManagerStudent");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        ImageIcon image = new ImageIcon("logo.png");
        setIconImage(image.getImage());

    }
}
