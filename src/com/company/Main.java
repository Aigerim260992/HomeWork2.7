package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList <String> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        A.add(sc.nextLine());
        A.add(sc.nextLine());
        A.add(sc.nextLine());
        A.add(sc.nextLine());
        A.add(sc.nextLine());
        System.out.println("A______________");
        Iterator iterator = A.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }
        ArrayList <String> B = new ArrayList<>();
        B.add(sc.nextLine());
        B.add(sc.nextLine());
        B.add(sc.nextLine());
        B.add(sc.nextLine());
        B.add(sc.nextLine());
        Collections.sort(B);
        Collections.reverse(B);
        System.out.println("B______________");
        iterator = B.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<String> C  = new ArrayList<>();
        for (int i = 0; i <A.size() ; i++) {
            C.add(A.get(i));
            C.add(B.get(i));

        }
        System.out.println("C______________");
        iterator = C.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    }

