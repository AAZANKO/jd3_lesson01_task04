package by.htp.zanko;

import org.junit.Test;

import java.util.ArrayList;

public class SortedDuoListTest {

    @Test
    public void getListDuo(){

        SortedDuoList sortedDuoList = new SortedDuoList();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(7);
        list1.add(9);

        list2.add(3);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        // Два списка
        list1 = sortedDuoList.getList(list1, list2);

        for (Integer i : list1) {
            System.out.println(i);
        }

    }

}