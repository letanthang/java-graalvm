package vn.act.demo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //primitive
        System.out.println("Hello world");
        int year = 2026;
        String action = "Hello world";
        boolean active = true;
        System.out.printf("Thang %s year:%d active:%b \n",  action, year, active);
        int[] ages = {100, 5, 7};
        System.out.println(Arrays.toString(ages));
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        //int/Integer: box, autobox
        int x = 100;
        Integer o = Integer.valueOf(x);
        System.out.printf("Integer o = %d\n", o);
        Integer obj = x;
        System.out.printf("Integer obj = %d\n", obj);
        int y = obj.intValue();
        System.out.printf("int y = %d\n", y);
        int z = obj;
        System.out.printf("int z = %d\n", z);

        //Collection
        List<String> names = new LinkedList<>();
//        Collection<String> names = new HashSet<String>();
//        Collection<String> names = new ArrayList<String>();
        names.add("Minton");
        names.add("Black");
        names.add("Heart");
        names.add("Thang");
        names.add("Thang");
        boolean hasMinton = names.contains("Minton");
        boolean hasMilton = names.contains("Milton");
        names.remove("Minton");
        System.out.printf("our hasMinton:%b, hasMilton:%b\n", hasMinton, hasMilton);
        for (String name: names) {
            System.out.println(name);
        }

        names.remove("Thang");
        names.remove(2);
        var fullNames = names.toArray();
        System.out.println(Arrays.toString(fullNames));

    }
}
