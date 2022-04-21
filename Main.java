package com.bkitsolution;

import java.util.*;

public class Main {
    //2. Phương thức Generic trong java
    //Giống như lớp generic, chúng ta có thể tạo phương thức generic có thể chấp nhận bất kỳ kiểu đối số nào.
    //
    //Chúng ta hãy xem một ví dụ đơn giản về phương thức generic
    //trong java để in các phần tử của mảng. Chúng ta sử dụng E để biểu thị phần tử.
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    //3. Ký tự đại diện trong Java Generics
    //Ký tự ? (dấu chấm hỏi) tượng trưng cho phần tử ký tự đại diện. Nó có nghĩa là bất kỳ loại nào.
    //Nếu chúng ta viết <? mở rộng Number>, nó có nghĩa là bất kỳ lớp con của Number ví dụ như Integer, Float, Double vv.
    //Bây giờ chúng ta có thể gọi phương thức của lớp Number qua bất kỳ đối tượng lớp con nào.
    // tao phuong thuc chi chap nhan tham so la lop con cua Shape
    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();// goi phuong thuc cua lop Shape boi lop con
        }
    }

    public static void main(String[] args) {
	    //use Integer
        MyGeneric<Integer> m1 = new MyGeneric<Integer>();
        m1.add(2);
        System.out.println(m1.get());

        //use String
        MyGeneric<String> m2 = new MyGeneric<String>();
        m2.add("Hello");
        System.out.println(m2.get());

        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'J', 'A', 'V', 'A'};
        System.out.print("In mang so nguyen: ");
        printArray(intArray);
        System.out.print("In mang ky tu: ");
        printArray(charArray);

        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);

        //4. Sử dụng Generics trong các đối tượng Collection
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("PHP");

        // list.add(32);//compile time error

        // show list

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Ví dụ về Generics trong java sử dụng Map
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Java");
        map.put(4, "PHP");
        map.put(2, "C++");

        // Now use Map.Entry for Set and Iterator
        Set<Map.Entry<Integer, String>> set = map.entrySet();

        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> e = itr.next(); // no need to typecast
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

}
