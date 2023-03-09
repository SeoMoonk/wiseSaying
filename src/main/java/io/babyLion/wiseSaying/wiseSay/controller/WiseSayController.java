package io.babyLion.wiseSaying.wiseSay.controller;

import io.babyLion.wiseSaying.Container;
import io.babyLion.wiseSaying.WiseSay;

import java.util.ArrayList;
import java.util.List;

public class WiseSayController {

    private int number;

    private List<WiseSay> wiseSays;

    public WiseSayController() {
        this.number = 0;
        this.wiseSays = new ArrayList<>();
    }

    public void write() {

        int id = number + 1;

        System.out.print("명언 : ");
        String content = Container.getSc().nextLine().trim();

        System.out.print("작가 : ");
        String authorName = Container.getSc().nextLine().trim();

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
            System.out.printf("%d / %s / %s \n", wiseSays.getId(), wiseSays.getAuthorName(), wiseSays.getContent());
        }
    }

    public void delete() {
//        String[] commandBits = input.split("\\?", 2);
//        String actionCode = commandBits[0];
//        Map<String, String> params = new HashMap<>();
//        String[] paramsBits = commandBits[1].split("&");
//
//        for(String paramStr : paramsBits) {
//            String[] paramStrBits = paramStr.split("=", 2);
//            String key = paramStrBits[0];
//            String value = paramStrBits[1];
//
//            params.put(key, value);
//        }
//
//        del_num = Integer.parseInt(params.get("id"));
//
//        //유효한 삭제인지 검사
//        for(int i=0; i<=wise_saying.size(); i++)
//        {
//            if(del_num == wise_saying.get(i).number)
//            {
//                wise_saying.remove(i);
//                count--;
//
//                System.out.printf("%d 번 명언이 삭제되었습니다.\n",del_num);
//                break;
//            }
//
//            if(i == wise_saying.size()-1)
//            {
//                System.out.printf("%d 번 명언은 존재하지 않습니다. \n", del_num);
//                break;
//            }
//
//        }

    }
}
