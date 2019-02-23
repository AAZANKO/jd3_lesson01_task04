package by.htp.zanko;

import org.junit.Test;

import java.util.ArrayList;

public class SortedMassiveListTest {

    @Test
    public void getListMassive(){

        SortedMassiveList sortedMassiveList = new SortedMassiveList();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(7);
        list1.add(9);

        list2.add(3);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        list3.add(13);
        list3.add(14);
        list3.add(16);
        list3.add(18);

        list4.add(12);
        list4.add(15);
        list4.add(17);
        list4.add(19);


        list1 = sortedMassiveList.getListMass(list1, list2, list3, list4);

        for (Integer i : list1) {
            System.out.println(i);
        }

    }

}