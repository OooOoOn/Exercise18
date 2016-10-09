package com.company;
import java.util.*;

/**
 * Created by Contents_4 on 22/09/2016.
 */
public class LogApplication {

    Logger logger;
    Scanner in = new Scanner(System.in);
    boolean running = true;

    public LogApplication(Logger logger){

        this.logger = logger;
    }

    void run(){
    while(running) {
        System.out.println("----------");
        System.out.println("1. Add message to log");
        System.out.println("2. Print log");
        System.out.println("3. Quit");
        System.out.println("----------");
        System.out.println();
        System.out.print("Choice: ");

        int reply = 0;
        try {
            reply = in.nextInt();
            in.nextLine();
        } catch (Exception e) {
            System.out.print("You must enter a number!");
        }

        switch (reply) {

            case 1:

                System.out.print("Enter your message: ");
                String log = in.nextLine();
                logger.log(log);
                break;

            case 2:

                for (String line : logger.getLogPosts()) {
                    System.out.println(line);
                }

                logger.clearList();
                LogApplication application2 = new LogApplication(logger);



                break;
        }

    }

    }
}
