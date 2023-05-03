//Complete

package task1231;

/* 
Ненужные абстракции
Необходимо расставить правильно ключевые слова abstract, чтобы программа компилировалась.
Добавь там, где нужно, и удали там, где они не нужны.


Requirements:
1. Класс Pegasus должен реализовывать интерфейс CanFly.
2. Класс Pegasus должен наследоваться от класса Horse.
3. Класс SwimmingPegasus должен наследоваться от класса Pegasus.
4. Объект класса Horse создать можно.
5. Объект класса Pegasus создать можно.
6. Метод swim() класса SwimmingPegasus не должен иметь реализации.*/

public class Solution {

    public static void main(String[] args) {
        Pegasus pegasus = new Pegasus();
        SwimmingPegasus swimmingPegasus = new SwimmingPegasus();

        pegasus.run();
        pegasus.fly();

        swimmingPegasus.run();
        swimmingPegasus.fly();
        swimmingPegasus.swim();

    }

    public interface CanFly {
        void fly();
    }

    public static abstract class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        @Override
        public void fly() {

        }
    }

    public static class SwimmingPegasus extends Pegasus {
        public void swim() {

        }
    }

}
