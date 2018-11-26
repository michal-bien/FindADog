package pl.akademia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame implements ActionListener {

    private ImageDao imageDao;

    private List<Imageable> imageables = new ArrayList<>();

    public List<Imageable> getImageables() {
        return imageables;
    }

    public void setImageables(List<Imageable> imageables) {
        this.imageables = imageables;
    }

    public ImageDao getImageDao() {
        return imageDao;
    }

    public void setImageDao(ImageDao imageDao) {
        this.imageDao = imageDao;
        imageDao.generateExampleData();
        // setImageables(imageDao.findAll());
    }

    private ImageGenerator simpleImageGenerator;
    private JPanel jPanel = new JPanel();


    public Main() {
        createFrameLayout();
        //jPanel.setSize(150,150);
        setImageDao(new ExampleImageData());
        simpleImageGenerator = new SimpleImageGenerator(getImageDao().findAll());
        try {
            imageables = simpleImageGenerator.generate();

        } catch (NoImageException e) {
            e.printStackTrace();
        }
        // for (int i = 1; i <16 ; i++) {
        //    animals.add(new Cat("jesus.jpg"));}
        setImageDao(new ExampleImageData());
        // animals.add(new Cat("jesus.jpg"));
        //animals.add(new Cat("jesus.jpg"));
        //animals.add(new Dog("satanleft.jpg"));
        //animals.add(new Cat("jesus.jpg"));
        for (int i = 1; i <= 4; i++) {
            JButton jButton = new JButton("");
            ImageIcon imageIcon = new ImageIcon(
                    imageables.get(i - 1).getFileName());
            jButton.setIcon(imageIcon);
            jButton.addActionListener(this);
            jButton.setName(imageables.get(i - 1).getClass().getSimpleName());
            jPanel.add(jButton);


        }
        add(jPanel);

    }

    private void createFrameLayout() {
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JLabel jLabel = new JLabel("Find a dog");
        jLabel.setFont(new Font("Serif", Font.PLAIN, 24));

        add(jLabel);

        jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 2));
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Kliknięto mnie");
        JButton clickedButton = (JButton) e.getSource();
        int theNumberWithSameClass=0;
        for (Imageable imageable:getImageables()){
            if (imageable.getClass().getSimpleName().equals(clickedButton.getName())){
                theNumberWithSameClass++;
            }

        }
        if (theNumberWithSameClass==1) {
            JOptionPane.showMessageDialog(this, "Brawoooooooooooo");
        }else
            JOptionPane.showMessageDialog(this, "Wrong!");

    }


}



