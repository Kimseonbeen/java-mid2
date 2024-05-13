package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.<Dog>checkup(dog); // 타입 추론이 일어나서 <Dog> 생략 가능
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        AnimalMethod.bigger(dog, targetDog);
        System.out.println("targetDog = " + targetDog);

    }
}
