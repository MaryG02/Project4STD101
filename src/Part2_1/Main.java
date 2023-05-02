package Part2_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pen");
        list.add("Pencil");
        list.add("Book");
        list.add("Table");
        String key = "Book";
        int beginIdx = 0;
        int endIdx = list.size()-1;
        int find = recLinearSearch(list, key, beginIdx, endIdx);
        System.out.println("Index of the key element "+ key+ " is "+find);
    }
    public static int recLinearSearch(ArrayList<String> list, String key, int beginIdx, int endIdx){
        if(beginIdx>endIdx){
            return -1;
        }
        else if (list.get(beginIdx).equals(key)){
            return beginIdx;
        }
        else {
            return  recLinearSearch(list, key, beginIdx+1, endIdx);
        }
    }
}
