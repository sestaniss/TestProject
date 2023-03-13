package class31;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo3 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> row1=new LinkedHashMap<>();
        row1.put("name", "Sam");
        row1.put("age", "34");
        row1.put("City", "Houston");
        row1.put("salary", "135000");

        LinkedHashMap<String,String> row2=new LinkedHashMap<>();
        row2.put("name", "Tami");
        row2.put("age", "28");
        row2.put("City", "Houston");
        row2.put("salary", "140000");

        LinkedHashMap<String,String> row3=new LinkedHashMap<>();
        row3.put("name", "Savo");
        row3.put("age", "36");
        row3.put("City", "Miami");
        row3.put("salary", "122000");

        LinkedHashMap<String,String> row4=new LinkedHashMap<>();
        row4.put("name", "Abeera");
        row4.put("age", "30");
        row4.put("City", "VA");
        row4.put("salary", "128000");

        List<Map<String,String>> allRows=new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);
        allRows.add(row3);
        allRows.add(row4);

        System.out.println(allRows);

    }
}
