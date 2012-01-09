package com.googlecode.usc;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author ShunLi
 */
class OpenLogTask extends java.util.TimerTask {
    private final static String NOTEPAD_PLUS_PLUS_PATH = "C:/Program Files/Notepad++/notepad++.exe";
    private final static String NOTEPAD_PATH = "notepad.exe";

    @Override
    public void run() {
        try {
            String execName = null;

            File file = new File(NOTEPAD_PLUS_PLUS_PATH);
            if (file.exists()) {
                execName = NOTEPAD_PLUS_PLUS_PATH;
            } else {
                execName = NOTEPAD_PATH;
            }

            Runtime.getRuntime().exec(execName + " " + System.getProperty("user.dir") + "\\log\\copier.log");
        } catch (IOException e) {
        }
    }
}
