package by.htp.zanko;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;

@NoArgsConstructor
public class SortedMassiveList {

    public ArrayList<Integer> getListMass(ArrayList<Integer> list1, ArrayList<Integer>... list) {

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                list1.add(list[i].get(j));
            }
        }
        Collections.sort(list1);
        return list1;
    }
}
