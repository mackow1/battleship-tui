package org.battleship.tui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Settings settings = new Settings();
        logger.info("Starting application v" + settings.getProgramVersion());
        long counter = 0;
        for (;;) {
            try {
                Thread.sleep(1000);
                logger.info("Iteration number " + String.valueOf(++counter));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}