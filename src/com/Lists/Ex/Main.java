package com.Lists.Ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(0,9);
        list1.add(1,10);
        list1.add(2,11);
//        System.out.println(list1);

        List<String> list2 = new ArrayList<String>();
        list2.add(0, "Luni");
        list2.add(1, "Marti");
        list2.add(2,"Miercuri");
//        System.out.println(list2);

        //1.
//        function(4, list1);

        //2.
//        function2(list1);

        //3.
//        function3(1,list1);

        //4.
//        function4(list1);

        //5.
//        function5(list2,0,"Ioana");

        //6.
//        function6(list1,79);

        //7.
//        function7(list1);

        //8.
        System.out.println(function8(list1));





//        list1.add(1,8); // adauga val 8 pe poz 1
//        System.out.println(list1);
//
//        list1.remove(2); // Sterge elementul de pe poz 2
//        System.out.println(list1);
//
//        list1.set(0,4); // schimba elementul de pe pozitia 0, ii atribuie val 4
//        System.out.println(list1);
//
//        System.out.println(list1.get(2)); //afiseaza elementul de pe poz 2


    }

    //1. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
    // Metoda sa adauge numarul primit ca si parametru la final de lista.
    public static void function(int number, List list1){
        for (int i=0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
        System.out.println(number);
    }

    //2. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou
    public static void function2(List list1){
        for (int i=0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
    }

    //3. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg. Sa se parcurga lista
    //si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.
    public static void function3(int number, List list1){
        for (int i=number; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
 //       System.out.println(number);
    }

    //4.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).
    public static void function4(List list1){
        for (int i=0; i < list1.size(); i++){
//            Collection.reverse(list1);
            System.out.println(list1.get(i));
        }
    }

    //5. Creati o metoda java care sa primeasca 3 parametrii, o lista de Stringuri, un int si un String. Metoda sa puna parametrul de tip String in lista pe pozitia int.
    public static void function5(List lista, int number, String string){
            lista.add(number, string);
            System.out.println(lista);
    }

    //6. Creati o metoda Java, care sa primeasca doi parametrii. Primul va fi o lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.
    public static void function6(List newList, int number){
        newList.add(0, number);
        System.out.println(newList);
    }

    //7. Scrieti o metoda Java care sa primeasca ca parametru o lista, si sa afiseze ce valori are lista si pe ce pozitie.
    public static void function7(List anotherList){
        for ( int i = 0; i <= anotherList.size(); i++){
            System.out.println("Pe pozitia: " + i + " este valoarea: " + anotherList.get(i));
        }
    }

    //8. Scrieti o metoda Java care sa primeasca ca parametru o lista si sa returneze cel mai mare numar din ea.
    public static int function8(List<Integer> myList) {
        int max = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            int j = myList.get(i);
            if (j > max) {
                max = j;
            }
        }

        return max;
    }


}







