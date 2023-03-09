package io.babyLion.wiseSaying;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Container.init();

        App app = new App();
        app.run();

        Container.close();
    }
}