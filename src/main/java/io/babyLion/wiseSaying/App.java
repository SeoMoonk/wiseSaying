package io.babyLion.wiseSaying;

import io.babyLion.wiseSaying.system.controller.SystemController;
import io.babyLion.wiseSaying.wiseSay.controller.WiseSayController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public void run() {
        System.out.println("== 명언 앱 ==");

        SystemController systemController = new SystemController();
        WiseSayController wiseSayController = new WiseSayController();

        while (true) {
            System.out.print("명령) ");

            // trim() : 혹시 있을지 모를 좌우공백제거된 버전으로 주세요.
            String command = Container.getSc().nextLine().trim();

            if (command.equals("종료"))
            {
                systemController.exit();
                break;
            }
            else if (command.equals("등록"))
            {
                wiseSayController.write();
            }
            else if (command.equals("목록"))
            {
                wiseSayController.list();
            }
            else if(command.startsWith("삭제"))       //삭제?id=1이 명령어기 때문에 삭제로 시작하는 단어라면 true 되도록 startsWith
            {
                System.out.println("command = " + command);

                //?를 기준으로 2덩이로 나눈다.
                //regex = 정규표현식
                String[] commandBits = command.split("\\?", 2);   //["삭제", "id=1"]

                String actionCode = commandBits[0]; // ["삭제"]
                String commandBit = commandBits[1];
                //삭제?id=1&content=2&test=3 ... 이런 경우라면?

                Map<String,String> parameters = new HashMap<>();

                String[] parameterBits = commandBit.split("&");
                // ["id=1", "content=2", "test=3"] ★★★ 이 배열을 가지고 foreach문을 반복한다.


                //아래의 for-each문으로 변경이 가능함!!
//                for(int i=0; i<parameterBits.length; i++)
//                {
//                    String parameterBit = parameterBits[i];
//
//                    String[] parameterSplit = parameterBit.split("=", 2);
//                    parameters.put(parameterSplit[0],parameterSplit[1]_);
//                }


                //for-each문을 사용하여 베열을 탐색 ★★★
                for(String parameter : parameterBits)
                {
                    // "="을 기준으로 두덩이로 나눔.
                    String[] parameterBit = parameter.split("=",2);
//                    =기준으로  2덩이로 나누기 라고 할때
//                    1. [id,1], [ie,2] 이런식으로 나눠지나요?
//                    OR
//                    2. [id, 1ie2] 이런식으로 나눠지나요?
                    // ----> 이래서 for each 문을 쓴것!!

                    //["id","1"]이렇게 나눠짐.
                    //그외? -> ["content","2"] , ["test","3"] ...
                    String key = parameterBit[0];
                    String value = parameterBit[1];

                    parameters.put(key, value);
                }

                System.out.printf("actionCode = %s\n" + actionCode);
                System.out.printf("parameters = %S\n", parameters);

            }
        }
    }
}