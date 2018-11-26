package pl.akademia;

import java.util.ArrayList;
import java.util.List;

public class ExampleImageData implements ImageDao {

    private List<Imageable> imageDaoList = new ArrayList<>();

    public void generateExampleData(){

        imageDaoList.add(new Cat("kot1.jpg"));
        imageDaoList.add(new Cat("kot2.jpg"));
        imageDaoList.add(new Cat("kot3.jpg"));
        imageDaoList.add(new Cat("pies1.jpg"));
        imageDaoList.add(new Dog("pies2.jpg"));
        imageDaoList.add(new Cat("pies3.jpg"));

    }

    @Override
    public void add(Imageable imageable) { imageDaoList.add(imageable);}

    @Override
    public List<Imageable> findAll() {return imageDaoList;}



}


