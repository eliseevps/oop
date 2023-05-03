//Complete

package task1319;

import java.io.*;

/* 
Писатель в файл с консоли
В этой задаче тебе нужно:
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.

Requirements:
1. Программа должна считывать c консоли имя файла.
2. Создай и используй объект типа BufferedWriter.
3. Программа не должна ничего считывать из файловой системы.
4. Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
5. Программа должна записать все введенные строки (включая "exit", но не включая имя файла) в файл: каждую строчку — с новой строки.
6. Метод main должен закрывать объект типа BufferedWriter после использования.
7. Метод main не должен выводить данные на экран.*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try (bufferedReader; BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bufferedReader.readLine()))) {
            String line;
            boolean isFirstLine = true;

            while (!(line = bufferedReader.readLine()).equals("exit")) {
                if (isFirstLine) {
                    bufferedWriter.write(line);
                    isFirstLine = false;
                    continue;
                }
                bufferedWriter.write("\n" + line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
