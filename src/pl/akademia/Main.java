package pl.akademia;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame {

    public Main(){
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        JLabel jLabel=new JLabel("Where is Satan???");
        jLabel.setFont(new Font("Serif", Font.PLAIN, 24));

        add(jLabel);

        JPanel jPanel=new JPanel();
        jPanel.setLayout(new GridLayout(4,4));
        jPanel.setSize(150,150);

        List<Imageable> animals=new ArrayList<>();

        for (int i = 0; i <15 ; i++) {
            animals.add(new Cat("jesus.jpg"));

        }


       /* animals.add(new Cat("jesus.jpg"));
        animals.add(new Cat("jesus.jpg"));
        animals.add(new Dog("satanleft.jpg"));
        animals.add(new Cat("jesus.jpg"));*/




        for (int i = 1; i <=16 ; i++) {
            JButton jButton= new JButton("");
            ImageIcon imageIcon=new ImageIcon(
                    animals.get(i-1).getFileName());
            jButton.setIcon(imageIcon);
            jPanel.add(jButton);

        }
        add(jPanel);


    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });

    }
}
