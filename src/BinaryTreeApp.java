import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryTreeApp extends JFrame {
    private JTextField inputField;
    private JComboBox<String> traversalType;
    private JTextField outputField;
    private JTextField qeField;
    private BinaryTree tree = new BinaryTree();

    public BinaryTreeApp() {
        setTitle("Binary Tree Application");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Adicionando margem entre os componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel label = new JLabel("Enter a value:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(label, gbc);

        inputField = new JTextField();
        gbc.gridx = 1;
        mainPanel.add(inputField, gbc);

        JButton insertButton = new JButton("Insert");
        gbc.gridx = 2;
        mainPanel.add(insertButton, gbc);

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(inputField.getText());
                tree.insert(value);
                inputField.setText("");
            }
        });

        JLabel traversalLabel = new JLabel("Select Traversal:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(traversalLabel, gbc);

        String[] options = {
                "Pre-order Left", "In-order Left", "Post-order Left",
                "Pre-order Right", "In-order Right", "Post-order Right"
        };
        traversalType = new JComboBox<>(options);
        gbc.gridx = 1;
        mainPanel.add(traversalType, gbc);

        JButton showButton = new JButton("Show Tree");
        gbc.gridx = 2;
        mainPanel.add(showButton, gbc);

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder output = new StringBuilder("Arvore: {");
                String type = (String) traversalType.getSelectedItem();

                switch (type) {
                    case "Pre-order Left":
                        tree.preOrderLeft(tree.root, output);
                        break;
                    case "In-order Left":
                        tree.inOrderLeft(tree.root, output);
                        break;
                    case "Post-order Left":
                        tree.postOrderLeft(tree.root, output);
                        break;
                    case "Pre-order Right":
                        tree.preOrderRight(tree.root, output);
                        break;
                    case "In-order Right":
                        tree.inOrderRight(tree.root, output);
                        break;
                    case "Post-order Right":
                        tree.postOrderRight(tree.root, output);
                        break;
                }

                if (output.length() > 9) {
                    output.setLength(output.length() - 1);
                }
                output.append("}");
                outputField.setText(output.toString());
            }
        });

        JLabel outputLabel = new JLabel("Output:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(outputLabel, gbc);

        outputField = new JTextField();
        outputField.setEditable(false);
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        mainPanel.add(outputField, gbc);
        gbc.gridwidth = 1;

        JLabel qeLabel = new JLabel("QE:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        mainPanel.add(qeLabel, gbc);

        qeField = new JTextField();
        qeField.setEditable(false);
        gbc.gridx = 1;
        mainPanel.add(qeField, gbc);

        JButton calculateButton = new JButton("Calculate QE");
        gbc.gridx = 2;
        mainPanel.add(calculateButton, gbc);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = tree.countNodes(tree.root);
                qeField.setText(String.valueOf(count));
            }
        });

        add(mainPanel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BinaryTreeApp();
    }
}
