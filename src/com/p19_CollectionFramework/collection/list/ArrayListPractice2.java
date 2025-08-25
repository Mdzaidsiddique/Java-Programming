package com.p19_CollectionFramework.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListPractice2 {
    // list type follow zero based indexing, there are many ways to traverse:

    // 1) using normal loop
    public void usingNormalLoop(ArrayList<String> arrayList){

        for(int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

    // 2) using enhanced loop:
    public void usingEnhancedLoop(ArrayList<String> arrayList){

        for(String item: arrayList){
            System.out.println(item);
        }
    }

    // 3) using iterator:
    public void usingiterator(ArrayList<String> arrayList){

        Iterator<String> iter = arrayList.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    // 4) using list iterator: can traverse in forward & backward direction
    public void usingListIterator(ArrayList<String> arrayList){

        ListIterator<String> listIter = arrayList.listIterator();

        // traversing in forward direction (.hasNext() & .next())
        while (listIter.hasNext()){
            System.out.println(listIter.next());
        }
        System.out.println("-----------------");

        // traversing in reverse direction (.hasPrevious() & .previous())
        while(listIter.hasPrevious()){
            System.out.println(listIter.previous());
        }

    }

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(); // default size it 10

        arrayList.add("one");
        arrayList.add("two");
        arrayList.add(null);
        arrayList.add("one");
        arrayList.add(null);

        ArrayListPractice2 alp2 = new ArrayListPractice2();

//        alp2.usingNormalLoop(arrayList);
//        alp2.usingEnhancedLoop(arrayList);
//        alp2.usingiterator(arrayList);
//        alp2.usingListIterator(arrayList);

        // converting ArrayList to object array
        Object [] objArray = arrayList.toArray();

        for(Object o : objArray){
            System.out.println(o);
        }

    }
}
