package ru.company.homework;

import ru.company.homework.Enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    public static List getListOfStudents() {
        List<Object> classroom = new ArrayList<>();
        for (int ii = 0; ii < 40; ii++) {
            if (ii % 3 == 0 && ii % 5 == 0) {
                classroom.add(new Student("Student " + ii, (ii%10+11), new Clothes("Jacket", (ii % 10)+5, (ii % 4) + 1, "red")
                        , Gender.MALE));
            } else if (ii % 3 == 0) {
                classroom.add(new Student("Student " + ii,(ii%10+10), new Clothes("Tshirt", (ii % 8)+9, (ii % 4) + 1, "yellow")
                        , Gender.MALE));
            } else if (ii % 5 == 0){
                classroom.add(new Student("Student " + ii,(ii%10+15), new Clothes("Sweeter", (ii % 12)+3, (ii % 4) + 1, "green")
                        , Gender.FEMALE));
            }
            else {
                classroom.add(new Student("Student " + ii,(ii%10+12), new Clothes("Pants", (ii % 6)+8, (ii % 4) + 1, "brown")
                        , Gender.FEMALE));
            }
        }
        return classroom;
    }
}
