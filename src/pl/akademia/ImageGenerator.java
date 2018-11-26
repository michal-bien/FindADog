package pl.akademia;

import java.util.List;

public interface ImageGenerator {
    List<Imageable> generate()throws NoImageException;
}
