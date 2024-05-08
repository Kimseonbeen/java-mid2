package genegic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점의 T의 타입 결정
        integerBox.set(10);
        //integerBox.set("aa");   // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); // integer 타입 반환(캐스팅 x)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        // 자바 컴파일러가 앞에 타입을 확인후 추론하여 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();

    }
}
