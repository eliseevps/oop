//Complete

package task1218;

/* 
Есть, летать и двигаться
Есть public интерфейсы CanFly (летать), CanMove (передвигаться), CanEat (есть).
Добавь эти интерфейсы классам Dog (собака), Car (автомобиль), Duck (утка), Airplane (самолет).


Requirements:
1. Класс Solution должен содержать интерфейс CanFly с одним методом fly().
2. Класс Solution должен содержать интерфейс CanMove с одним методом move().
3. Класс Solution должен содержать интерфейс CanEat с одним методом eat().
4. Собака должна уметь передвигаться и есть.
5. Автомобиль должен уметь передвигаться.
6. Самолет должен уметь передвигаться и летать.
7. Утка должна уметь передвигаться, летать и есть.*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanMove {
        void move();
    }

    public interface CanEat {
        void eat();
    }

    public class Dog implements CanMove, CanEat {
        @Override
        public void move() {
            System.out.println("Двигаюсь");
        }

        @Override
        public void eat() {
            System.out.println("Кушаю");
        }
    }

    public class Duck implements CanFly, CanMove, CanEat {
        @Override
        public void fly() {
            System.out.println("Летаю");
        }

        @Override
        public void move() {
            System.out.println("Двигаюсь");
        }

        @Override
        public void eat() {
            System.out.println("Кушаю");
        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {
            System.out.println("Двигаюсь");
        }
    }

    public class Airplane implements CanFly, CanMove {
        @Override
        public void fly() {
            System.out.println("Летаю");
        }

        @Override
        public void move() {
            System.out.println("Двигаюсь");
        }
    }
}
