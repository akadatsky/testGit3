package com.akadatsky;

import com.akadatsky.settings.Settings;

import com.akadatsky.login.Login;

public class Main {

    public static void main(String[] args) {
        Settings.getProperty();
        Settings.setProperty();
        Login.getName();
    }

}
