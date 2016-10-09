package com.company;
import java.util.List;
/**
 * Created by Contents_4 on 22/09/2016.
 */
public interface Logger {


    public List<String> getLogPosts();
    public void log(String input);
    public void clearList();
}
