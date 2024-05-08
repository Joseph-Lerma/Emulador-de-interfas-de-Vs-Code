import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class SimularVscode extends JFrame {
    public SimularVscode() {
        setTitle("Emulación de VS Code");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());


        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());


        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Archivo");
        fileMenu.add(new JMenuItem("Nuevo archivo"));
        fileMenu.add(new JMenuItem("Abrir archivo"));
        fileMenu.add(new JMenuItem("Guardar"));
        fileMenu.add(new JMenuItem("Guardar como"));
        fileMenu.addSeparator();
        fileMenu.add(new JMenuItem("Salir"));
        menuBar.add(fileMenu);
        topPanel.add(menuBar, BorderLayout.NORTH);


        JToolBar toolBar = new JToolBar();
        toolBar.add(new JButton("Nuevo"));
        toolBar.add(new JButton("Abrir"));
        toolBar.add(new JButton("Guardar"));
        topPanel.add(toolBar, BorderLayout.SOUTH);


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        centerPanel.add(scrollPane, BorderLayout.CENTER);


        JPanel sidePanel = new JPanel();
        sidePanel.setLayout(new GridLayout(2, 1)); 

       
        JTree fileTree1 = new JTree();
        JScrollPane treeScrollPane1 = new JScrollPane(fileTree1);
        sidePanel.add(treeScrollPane1);

        
        DefaultMutableTreeNode rootNode2 = new DefaultMutableTreeNode("Social networks");
        DefaultMutableTreeNode childNode2 = new DefaultMutableTreeNode("Tiktok");
        DefaultMutableTreeNode childNode3 = new DefaultMutableTreeNode("Instagram");
        DefaultMutableTreeNode childNode4 = new DefaultMutableTreeNode("Facebook");
        DefaultMutableTreeNode childNode5 = new DefaultMutableTreeNode("Whatsapp");
        rootNode2.add(childNode2);
        rootNode2.add(childNode3);
        rootNode2.add(childNode4);
        rootNode2.add(childNode5);
        JTree fileTree2 = new JTree(rootNode2);
        JScrollPane treeScrollPane2 = new JScrollPane(fileTree2);
        sidePanel.add(treeScrollPane2);


        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(sidePanel, BorderLayout.WEST);


        getContentPane().add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimularVscode::new);
    }
}
