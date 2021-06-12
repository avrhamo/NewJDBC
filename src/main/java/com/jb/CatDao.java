package com.jb;

import java.util.List;

public interface CatDao {

    void addCat(Cat cat);
    void updateCat(Cat cat);
    void deleteCat(Cat cat);

    Cat getSingleCat();
    List<Cat> getAllCats();

}
