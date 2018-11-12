package pl.akademia;

import java.util.List;

public interface ImageDao {

    void add(Imageable imageable);
    List<Imageable> findAll();
    void generateExampleData();
}
