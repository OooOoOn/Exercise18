package com.company;

import java.util.List;

import java.util.ArrayList;

/**
 * Created by Contents_4 on 22/09/2016.
 */
public class SimpleLogger implements Logger {


    List<String> list = new ArrayList<>();

    @Override
    public List<String> getLogPosts() {
        return list;
    }



    @Override
    public void log(String input) {

        list.add(input);
    }

    public void clearList(){

        list.clear();
    }


}
