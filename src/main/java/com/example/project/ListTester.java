package com.example.project;

public class ListTester {

    
    public static <T> void circularLeftShift(List <T> list, int n)
    {

        for(int i = 0 ; i < n ; i++){
            list.findFirst();
            T y = list.retrieve();

            while( !list.last()){
                e.findNext();
            }
            list.insert(y);
            list.findFirst();
            list.remove();
        }
    }
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
    {
         // Write the method reverseCopy, user of DoubleLinkedList, which copies the elements
        // of l1 to l2 in reverse order. The list l1 must not change. Assume that l2 is empty.
        // The method signature is public static <T> void reverseCopy(DoubleLinkedList<T> l1,
        // DoubleLinkedList<T> l2).
        // Example 4.1. If l1 : A ↔ B ↔ C ↔ D, then calling reverseCopy(l1, l2) results in
        // l2 : D ↔ C ↔ B ↔ A.

        l.findFirst();
        while(!l1.last()){

            while( !l1.last() ) l.findNext();
            T x = l1.retrieve();
            l2.insert(x);
        }
         T x = l1.retrieve();
            l2.insert(x);
        
   }

    
}
