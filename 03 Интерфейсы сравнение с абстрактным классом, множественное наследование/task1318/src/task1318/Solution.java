//Complete

package task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чтение файла
В этой задаче тебе нужно:
Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.

Requirements:
1. Программа должна считывать c консоли путь к файлу.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader =
                     new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream =
                     new FileInputStream(bufferedReader.readLine())) {
            int symbol;

            while ((symbol = fileInputStream.read()) != -1) {
                System.out.print((char) symbol);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}