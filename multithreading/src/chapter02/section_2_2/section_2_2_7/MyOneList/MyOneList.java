package chapter02.section_2_2.section_2_2_7.MyOneList;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {
    private List list = new ArrayList();

    synchronized public void add(String data) {
        list.add(data);
    }

    synchronized public int getSize() {
        return list.size();
    }
}
