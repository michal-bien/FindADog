package pl.akademia;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame {

    private ImageDao imageDao;

    private List<Imageable> imageables=new ArrayList<>();

    public List<Imageable> getImageables(){
        return imageables;
    }

    public void setImageables(List<Imageable>imageables){
        this.imageables=imageables;
    }
    public ImageDao getImageDao(){
        return imageDao;
    }
    public void setImageDao(ImageDao imageDao){
        this.imageDao=imageDao;
        imageDao.generateExampleData();
        setImageables(imageDao.findAll());
    }
    private JPanel jPanel;


    public Main(){
        createFrameLayout();
        //jPanel.setSize(150,150);


       // for (int i = 1; i <16 ; i++) {
        //    animals.add(new Cat("jesus.jpg"));}
    setImageDao(new ExampleImageData());
    // animals.add(new Cat("jesus.jpg"));
        //animals.add(new Cat("jesus.jpg"));
        //animals.add(new Dog("satanleft.jpg"));
        //animals.add(new Cat("jesus.jpg"));
        for (int i = 1; i <=6; i++) {
            JButton jButton= new JButton("");
            ImageIcon imageIcon=new ImageIcon(
                    imageables.get(i-1).getFileName());
            jButton.setIcon(imageIcon);
            jPanel.add(jButton);

        }
        add(jPanel);

    }private void createFrameLayout() {
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        JLabel jLabel=new JLabel("Where is Satan???");
        jLabel.setFont(new Font("Serif", Font.PLAIN, 24));

        add(jLabel);

        jPanel=new JPanel();
        jPanel.setLayout(new GridLayout(2,2));
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
