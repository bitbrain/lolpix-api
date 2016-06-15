package org.lolpix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Lukas F&uuml;lling
 */
@SpringBootApplication
public class LolpixApiApplication {
    public static final String VERSION = "0.0.1-SNAPSHOT";

    public static void main(String[] args) {
        SpringApplication.run(LolpixApiApplication.class, args);
    }
}
