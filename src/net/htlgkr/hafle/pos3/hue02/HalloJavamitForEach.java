package net.htlgkr.hafle.pos3.hue02;

import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
    private List<String> list = new ArrayList<>();
    public void main(String[] args) {
        HalloJavamitForEach halloJavamitForEach = new HalloJavamitForEach();
        halloJavamitForEach.oldForEach();
        list.forEach(System.out::println);
    }
    private void oldForEach(){
        list.add("first");
        list.add("second");
        list.add("third");
        for (String n:list) {
            System.out.println(n);
        }
    }
}
