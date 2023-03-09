package io.babyLion.wiseSaying.wiseSay.controller;

import io.babyLion.wiseSaying.WiseSay;

import java.util.List;
import java.util.Scanner;

public class WiseSayController {

    private Scanner sc;

    private int number;

    private List<WiseSay> wiseSays;

    public WiseSayController(Scanner sc) {
        this.sc = sc;
    }

    public void write() {

        //int number = 0;
        int id = number + 1;

        System.out.print("명언 : ");
        String content = sc.nextLine().trim();

        System.out.print("작가 : ");
        String authorName = sc.nextLine().trim();

        WiseSay say = new WiseSay(id, content, authorName);
        wiseSays.add(say);

        System.out.printf("%d번 명언이 등록되었습니다.\n", id);

        number = id;
    }

    public void list() {

        System.out.println("번호 / 작가 / 명언");

        System.out.println("-".repeat(30));

        for(int i=0; i<wiseSays.size(); i++)
        {
            WiseSay wiseSay = wiseSays.get(i);
            System.out.printf("%d / %s / %s \n", wiseSays.get(number).getId(), wiseSays.get(number).getAuthorName(), wiseSays.get(number).getContent());
        }



    }
}
