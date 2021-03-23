import java.util.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int[] a = new int[10];
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10);
        }

        long toListStartTime = System.nanoTime();
        list = toList(a);
        long toListEndTime = System.nanoTime();
        System.out.println("Время преобразования массива в список: "+(toListEndTime-toListStartTime));
        System.out.println();



        //задание 2
        System.out.println("Задание 2");

        long listAddTimeStart = System.nanoTime();
        list.add(1,6);
        long listAddTimeEnd = System.nanoTime();
        System.out.println("Время выполнения добавления в список: "+(listAddTimeEnd-listAddTimeStart));

        long listRemoveTimeStart = System.nanoTime();
        list.remove(5);
        long listRemoveTimeEnd = System.nanoTime();
        System.out.println("Время выполнения удаления из списка: "+(listRemoveTimeEnd-listRemoveTimeStart));

        long listGetTimeStart = System.nanoTime();
        int x = list.get(3);
        long listGetTimeEnd = System.nanoTime();
        System.out.println("Время выполнения получения элемента из списка: "+(listGetTimeEnd-listGetTimeStart));



        //Задание 3
        System.out.println("Задание 3");
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.insert(5);
        list1.insert(20);
        list1.insert(-30);
        list1.insert(25);
        list1.deleteFirst();
        System.out.println("Ищем элемент 25:");
        System.out.println(list1.find(25));
        System.out.println("Вывод списка:");
        list1.display();
        System.out.println();



        //Задание 4
        LinkedList<Integer> list2 = new LinkedList<>(list);
        list2.add(50);
        int y = list2.get(0);
        list2.remove(0);
        LinkedList<Cat> list3 = new LinkedList<>();
        list3.add(new Cat("Барсик",5));
        list3.add(new Cat("Пушок",2));
        list3.add(new Cat("Барсик",4));
        System.out.println();



        //Задание 5
        System.out.println("Задание 5");
        ListIterator<Integer> iter = list2.listIterator();

        long nextTimeStart = System.nanoTime();
        iter.next();
        long nextTimeEnd = System.nanoTime();
        System.out.println("Время выполнения метода: "+(nextTimeEnd-nextTimeStart));

        long removeTimeStart = System.nanoTime();
        iter.remove();
        long removeTimeEnd = System.nanoTime();
        System.out.println("Время выполнения метода(удаления): "+(removeTimeEnd-removeTimeStart));

        long hasNextTimeStart = System.nanoTime();
        iter.hasNext();
        long hasNextTimeEnd = System.nanoTime();
        System.out.println("Время выполнения метода: "+(hasNextTimeEnd-hasNextTimeStart));

        long nextIndexTimeStart = System.nanoTime();
        iter.nextIndex();
        long nextIndexTimeEnd = System.nanoTime();
        System.out.println("Время выполнения метода: "+(nextIndexTimeEnd-nextIndexTimeStart));







    }

    public static ArrayList<Integer> toList(int[] a){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : a) {
            list.add(i);
        }
        return list;
    }
}
