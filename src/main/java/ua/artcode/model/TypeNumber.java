package ua.artcode.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by Alexander on 13.12.2016.
 */
public class TypeNumber {
    private ArrayList<String> list;

    public TypeNumber() {
        list = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "TypeNumber{" +
                "list=" + list +
                '}';
    }

    /*public void print(){
        System.out.println(list.keySet());
    }*/
}
