package template.lecture.helper;

public class DefaultGameConnectHelper extends GameConnectHelper {

    @Override
    protected String doSecurity(String string) {
//        System.out.println("디코드");
        System.out.println("강화된 알고리즘을 이용한 디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디/암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        // 서버에서 유저이름으로 유저의 나이 확인, 지금 시간 확인
        // 성인이 아니고 10시가 지났다면 권한 없음으로 처리돼야됨
        return -1;
//        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계");
        return info;
    }
}
