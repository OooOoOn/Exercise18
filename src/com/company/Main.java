package com.company;

public class Main {

    public static void main(String[] args) {
	//
        Logger logger = new SimpleLogger();

        LogApplication application = new LogApplication(logger);

        application.run();
        // write your code here
    }
}
