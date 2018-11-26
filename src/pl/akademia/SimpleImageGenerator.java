package pl.akademia;

import java.util.*;

public class SimpleImageGenerator implements ImageGenerator {


    private List<Imageable> imageDaoList = new ArrayList<>();

    private Set<String> generatedClasses = new HashSet<>();


    public SimpleImageGenerator(List<Imageable> imageDaoList) {
        this.imageDaoList = imageDaoList;
    }

    @Override
    public List<Imageable> generate() throws NoImageException {

        Random random = new Random();
        List<Imageable> generatedImages = new ArrayList<>();
        int generatedIndex;
        String className;
        while (true) {
            generatedIndex = random.nextInt(imageDaoList.size());
            className = imageDaoList.get(generatedIndex).getClass().getSimpleName();
            if (!generatedClasses.contains(className))
                break;
        }

        int counter = 0;

        for (Imageable imageable : imageDaoList) {
            if (imageable.getClass().getSimpleName().equals(className)) {
                generatedImages.add(imageable);
                counter++;
            }
            if ( counter==3)
                break;
        }


        while (true) {
            generatedIndex = random.nextInt(imageDaoList.size());
            if (!imageDaoList.get(generatedIndex).getClass().getSimpleName().equals(className)) {
                generatedImages.add(imageDaoList.get(generatedIndex));
                break;
            }}
        generatedClasses.add(className);
        return generatedImages;




    }}