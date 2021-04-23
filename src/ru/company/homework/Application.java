package ru.company.homework;

import ru.company.homework.Enums.Gender;

import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Student> students = Classroom.getListOfStudents();

        System.out.println("Всего самок в классе: " + students.stream().filter(it -> it.getGender().equals(Gender.FEMALE)).count());
        System.out.println("Всего мужиков в классе: " + students.stream().filter(it -> it.getGender().equals(Gender.MALE)).count());

        System.out.println("Средний возраст : " + students.stream().mapToInt(e -> e.getAge()).average().getAsDouble()); //если честно, это подсмотрел


        System.out.println("====================Сортировка по одежде вверх==============================");
        List<Student> collectNameOfClothesUp = students.stream().sorted((o1, o2) -> (o1.getClothes()
                .getNameOfClothes()
                .compareTo(o2.getClothes()
                        .getNameOfClothes()))).collect(Collectors.toList());
        collectNameOfClothesUp.forEach(it -> System.out.println(it.getName() + " "+ it.getClothes().getNameOfClothes()));

        System.out.println("====================Сортировка по одежде вниз==============================");
        List<Student> collectNameOfClothesDown = students.stream().sorted((o1, o2) -> (o2.getClothes()
                .getNameOfClothes()
                .compareTo(o1.getClothes()
                        .getNameOfClothes()))).collect(Collectors.toList());
        collectNameOfClothesDown.forEach(it -> System.out.println(it.getName() + " " + it.getClothes().getNameOfClothes()));

        System.out.println("====================Сортировка по размеру одежды вниз==============================");
        List<Student> collectSizeOfClothesDown = students.stream().sorted((o1, o2) -> (o2.getClothes()
                .getSize())
                .compareTo(o1.getClothes().getSize())).collect(Collectors.toList());
        collectSizeOfClothesDown.forEach(it -> System.out.println(it.getName() + " size: " + it.getClothes().getSize()));

        System.out.println("====================Вывод людей с двумя карманами==============================");
        List<Student> collectTwoPocketPeople = students.stream()
                .filter(it -> it.getClothes().getNumberOfPocket().equals(2))
               .collect(Collectors.toList());
        collectTwoPocketPeople.forEach(it -> System.out.println(it.getName() + " pockets: " + it.getClothes().getNumberOfPocket()));

        System.out.println("====================Вывод людей с зеленой и коричневой одежкой==============================");
        List<Student> collectColourClothesPeople = students.stream()
                .filter(it -> it.getClothes().getColour().equals("green") || it.getClothes().getColour().equals("brown"))
                .collect(Collectors.toList());
        collectColourClothesPeople.forEach(it -> System.out.println(it.getName() + " pockets: " + it.getClothes().getColour()));

    }
}
