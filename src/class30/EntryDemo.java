package class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class EntryDemo {
    public static void main(String[] args) {
        Set<Entry> entrySet=new LinkedHashSet<>();

        entrySet.add(new Entry(1,"Sam"));
        entrySet.add(new Entry(2,"Tami"));
        entrySet.add(new Entry(3,"Abeera"));
        entrySet.add(new Entry(4,"Hiral"));
        entrySet.add(new Entry(5,"Wilasinee"));
        entrySet.add(new Entry(6,"Gulzhanar"));
        entrySet.add(new Entry(7,"Savo"));

        entrySet.removeIf(x->x.getKey()>2&&x.getValue().contains("i"));
        System.out.println(entrySet);
    }
}
