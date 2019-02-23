package by.htp.zanko;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;

@NoArgsConstructor
public class SortedDuoList {

    public ArrayList<Integer> getList(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        if (list1.isEmpty()) {
            for (int i = 0; i < list2.size(); i++) {
                list1.add(list2.get(i));
            }
        } else if (list2.isEmpty()) {
            return list1;
        } else {
            for (int i = 0; i < list2.size(); i++) {
                list1.add(list2.get(i));
            }
            Collections.sort(list1);
        }
        return list1;
    }
}
