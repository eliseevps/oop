//Complete

package task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10


Requirements:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа, считанные из файла, отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла — FileInputStream.*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
             Scanner scanner = new Scanner(fileInputStream)) {

            List<Integer> inputArray = new ArrayList<>();
            List<Integer> outputArray = new ArrayList<>();

            while (scanner.hasNext()) {
                inputArray.add(scanner.nextInt());
            }

            for (Integer i : inputArray) {
                if (i % 2 == 0) {
                    outputArray.add(i);
                }
            }
            Collections.sort(outputArray);

            for (Integer i : outputArray) {
                System.out.println(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
