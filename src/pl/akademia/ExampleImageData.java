package pl.akademia;

import java.util.ArrayList;
import java.util.List;

public class ExampleImageData implements ImageDao {

    private List<Imageable> imageDaoList = new ArrayList<>();

    public void generateExampleData(){

        imageDaoList.add(new Cat("jesus.jpg"));
        imageDaoList.add(new Cat("jesus.jpg"));
        imageDaoList.add(new Cat("jesus.jpg"));
        imageDaoList.add(new Cat("satanleft.jpg"));
        imageDaoList.add(new Cat("satanleft.jpg"));
        imageDaoList.add(new Cat("satanleft.jpg"));


    }

    @Override
    public void add(Imageable imageable) { imageDaoList.add(imageable);}

    @Override
    public List<Imageable> findAll() {return imageDaoList;}



}


