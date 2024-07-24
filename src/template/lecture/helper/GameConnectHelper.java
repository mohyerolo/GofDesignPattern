package template.lecture.helper;

public abstract class GameConnectHelper {
    // 템플릿 메서드
    public String requestConnection(String encodedInfo) {
        // 보안 작업 -> 암호화 된 문자열 복호화
        String decodedInfo = doSecurity(encodedInfo);

        // 예시이므로 그냥 지정
        String id = "aaa";
        String password = "bbb";
        if (!authentication(id, password)) {
            throw new Error("아이디, 암호 불일지");
        }

        String userName = "name";
        int authorization = authorization(userName);

        String status = switch (authorization) {
            case -1 -> throw new Error("셧다운");
            case 0 -> "게임 매니저";
            case 1 -> "유료 회원";
            case 2 -> "무료 회원";
            case 3 -> "권한 없음";
            default -> "기타 사항";
        };
        System.out.println(status);

        return connection(decodedInfo);
    }

    // 외부 호출은 안 되지만 하위 클래스는 재정의할 수 있어야되므로 protected
    protected abstract String doSecurity(String string);

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String userName);
    protected abstract String connection(String info);
}