package ru.company;

import java.awt.event.ItemEvent;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
/*        String [] arr = new String[5];
        arr[0]="2";
        arr[1]="df";
        arr[2]="as";
        arr[3]="er";
        arr[4]="asdfv";
        Arrays.sort(arr);

        Collection<String> collection;
        Queue<String> queue;   // очередь
        queue.poll();
        ArrayList<String> arrayList;    //динамический массив, лучше чем LinkedList по скорости выборки элементов
        LinkedList<String> linkedList; // связанный список, каждый элемент связан с соседними. быстрее arrayList вставляет и удаляет элементы

        ArrayDeque<String> arrayDeque;
        HashSet<String> hashSet;        //хранит в коллекции только уникальные пары объектов и их хэшкодов
        TreeSet<String> treeSet;        //хранит уникальные элементы в виде бинарного дерева
        LinkedHashSet<String> linkedHashSet;    //hashset только связанный
        PriorityQueue<String> priorityQueue;    //очередь с приоритетами элементов
        HashMap<String , String> hashMap;       //словарь, ключи должны быть уникальными
        TreeMap<String , String> treeMap;       //ключ/значение деревом

        List<Integer> collect = new ArrayList<>(){{
            add(-34);
            add(30);
            add(-340);
            add(670);
        }};

        Comparator<Integer> comparator = Collections.reverseOrder();
        Collections.sort(collect,comparator);
        collect.forEach(System.out::println);
*/
        List<User> users = new ArrayList<>();
        users.add(new User("User1",16));
        users.add(new User("User2",12));
        users.add(new User("User3",36));
        users.add(new User("User4",18));
        users.add(new User("User5",42));

//        users.forEach(it -> System.out.println(it.getName()+it.getAge()));
//        System.out.println("==============================");

/*        Comparator<User> comparator = new Comparator<>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        };
        users.sort(comparator);
        users.forEach(it -> System.out.println(it.getName()+it.getAge()));

        SomeSort someSort = (u1, u2) -> u1.getAge()- u2.getAge();
        users.sort(someSort);
        System.out.println("==============================");
        users.forEach(it -> System.out.println(it.getName()+" "+it.getAge()));
*/
        List<Integer> integers = new ArrayList<>();
        integers.add(-1);
        integers.add(12);
        integers.add(0);
        integers.add(1050);
        integers.add(232);
        integers.add(6);
        integers.add(128);
        integers.add(14);
        integers.add(868);
        integers.add(9);

        IntStream.of(-1,12,0,1050,232,6,128,14,868,9)  //создать поток данных целых чисел с такими значениями
        .filter(it -> it<100).forEach(System.out::println);
        Stream<String> stream;
        IntStream stream1;
        DoubleStream doubleStream;
        LongStream longStream;
        Optional<User> max = users.stream().max((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(max.get().getAge());

        List<Integer> collect = users.stream().map(it -> it.getAge()).collect(Collectors.toList());
        Optional<User> user3 = users.stream().filter(it -> it.getName().equals("User3")).findFirst();
        System.out.println(user3.get().getAge());

    }
}
