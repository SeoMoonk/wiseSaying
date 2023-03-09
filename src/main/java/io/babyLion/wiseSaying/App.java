package io.babyLion.wiseSaying;

import io.babyLion.wiseSaying.system.controller.SystemController;
import io.babyLion.wiseSaying.wiseSay.controller.WiseSayController;

import java.util.Scanner;

public class App {

    public void run() {
        System.out.println("== 명언 앱 ==");

        SystemController systemController = new SystemController();
        WiseSayController wiseSayController = new WiseSayController(Container.getSc());

        while (true) {
            System.out.print("명령) ");
            // trim() : 혹시 있을지 모를 좌우공백제거된 버전으로 주세요.
            String command = Container.getSc().nextLine().trim();


            if (command.equals("종료")) {
                systemController.exit();
                break;
            } else if (command.equals("등록")) {
                wiseSayController.write();
            } else if (command.equals("목록")) {
                wiseSayController.list();
            }
        }
    }
}