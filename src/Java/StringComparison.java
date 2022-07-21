package Java;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Smile";      // 리터럴을 이용한 방식으로 String 변수 생성
        String str2 = "Smile";      // 리터럴을 이용한 방식으로 String 변수 생성

        String str3 = new String("Smile");      // new 연산자를 이용한 방식으로 String 변수 생성
        String str4 = new String("Smile");      // new 연산자를 이용한 방식으로 String 변수 생성

        System.out.println(str1 == str2);       // 주소 값을 비교     T
        System.out.println(str2 == str3);       // 주소 값을 비교     F
        System.out.println(str2.equals(str3));      // 값 자체를 비교     T
        System.out.println(str3.equals(str4));      // 값 자체를 비교     T



    }
}
