package template.lecture;

import template.lecture.helper.DefaultGameConnectHelper;
import template.lecture.helper.GameConnectHelper;

public class Main {
    public static void main(String[] args) {
        GameConnectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection("아이디 암호 등 접속 정보");
    }
}
