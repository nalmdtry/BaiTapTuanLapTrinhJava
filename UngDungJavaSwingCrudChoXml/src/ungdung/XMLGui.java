package ungdung;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XMLGui extends JFrame {
    private JTextField nameField, contentField;
    private JTextArea displayArea;

    public XMLGui() {
        setTitle("Quản lý Thẻ XML");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel nhập liệu
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Tên thẻ:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Nội dung:"));
        contentField = new JTextField();
        inputPanel.add(contentField);

        JButton addButton = new JButton("Thêm");
        JButton updateButton = new JButton("Cập nhật");
        JButton deleteButton = new JButton("Xóa");

        inputPanel.add(addButton);
        inputPanel.add(updateButton);
        inputPanel.add(deleteButton);

        add(inputPanel, BorderLayout.NORTH);

        // Khu vực hiển thị danh sách XML
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        add(scrollPane, BorderLayout.CENTER);

        JButton refreshButton = new JButton("Làm mới");
        add(refreshButton, BorderLayout.SOUTH);

        // Khởi tạo file XML
        XMLService.createXMLFile();
        loadXMLData();

        // Sự kiện cho nút Thêm
        addButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String content = contentField.getText().trim();
            if (!name.isEmpty() && !content.isEmpty()) {
                XMLService.addElement(name, content);
                loadXMLData();
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin.");
            }
        });

        // Sự kiện cho nút Cập nhật
        updateButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String newContent = contentField.getText().trim();
            if (!name.isEmpty() && !newContent.isEmpty()) {
                XMLService.updateElement(name, newContent);
                loadXMLData();
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin.");
            }
        });

        // Sự kiện cho nút Xóa
        deleteButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            if (!name.isEmpty()) {
                XMLService.deleteElement(name);
                loadXMLData();
            } else {
                JOptionPane.showMessageDialog(this, "Nhập tên thẻ cần xóa.");
            }
        });

        // Sự kiện cho nút Làm mới
        refreshButton.addActionListener(e -> loadXMLData());
    }

    private void loadXMLData() {
        displayArea.setText(XMLService.readXML());
    }
}

