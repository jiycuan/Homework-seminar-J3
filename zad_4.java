// Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, 
// что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. 
// Напишите метод для заполнения данной структуры.

import java.util.ArrayList;
import java.util.Scanner;

public class zad_4 {
    public static void main(String[] args) {

        ArrayList<Object> library = new ArrayList<Object>();
        fill_library(library);
        System.out.println(library);

    }

    public static void fill_library(ArrayList<Object> library) {
            
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите название жанра: ");
        String gen = in.nextLine();

        System.out.print("Укажите через запятую все наименования книг для выбранного жанра: ");
        String name_book = in.nextLine();

        ArrayList<String> temp_library = new ArrayList<String>();
        temp_library.add(gen);
        String[] array_name_book = name_book.split(",");

        for (int i = 0; i < array_name_book.length; i++) {
            temp_library.add(array_name_book[i]);
        } 

        library.add(temp_library);

        System.out.print("Введите 1 если нужно добавить ещё один жанр с соответствующим списком книг. Если нет - 0.");
        Integer bool = in.nextInt();
        if (bool == 1) {
            fill_library(library);
        }
        in.close();
    }
}