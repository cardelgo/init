package com.init;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DecimalFormat;


public class MainApp {

    static final Logger log = LogManager.getLogger(MainApp.class);
    static DecimalFormat df = new DecimalFormat();
    public static void main(String[] args) {

        System.out.println("args11111 = [" + args + "]");
        for (int i = 1; i <=1000000 ; i++) {
            log.info("[" + df.format(i) + "]");
        }

    }
}
