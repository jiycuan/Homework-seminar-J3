// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;

public class zad_3 {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        int len_list = 10;

        for (int i = 0; i < len_list; i++) {
            list.add((int) ( Math.random() * 100 ));
        }

        System.out.println(list);

        int min = list.get(0);
        int max = list.get(0);
        int aver = 0;
        int count = 0;

        for (int i = 0; i < len_list; i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
            if (list.get(i) > max) {
                max = list.get(i);
            }
            count = count + list.get(i);
        }
        aver = count / len_list;
        System.out.printf("Минимальное значение в списке: %d \nМаксимальное значение в списке: %d \nСреднее значение в списке: %d \n", min, max, aver);
    }
}