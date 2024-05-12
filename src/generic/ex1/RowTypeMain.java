package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
//        GenericBox<Object> integerBox =  new GenericBox<>();
        integerBox.set(10);
        String result = (String) integerBox.get();
        System.out.println("result = " + result);   // error

        // <>를 지정하지 않는다면, 로 타입(row type), 또는 원시 타입이라한다.
        // 원시타입을 사용하면 내부의 타입 매개변수가 Object로 사용된다고 이해하면된다.
        
        // 로 타입을 사용하지 않아야함 !!
        // 예전 자바 버전 호환을 위해 존재하는것뿐

    }
}
