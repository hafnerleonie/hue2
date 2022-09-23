package net.htlgkr.hafle.pos3.hue02;

import java.util.List;

public class HalloJavamitForEach {
    private List<String> list;
    public static void main(String[] args) {
        HalloJavamitForEach halloJavamitForEach = new HalloJavamitForEach();
        halloJavamitForEach.oldForEach();
    }
    private void oldForEach(){
        for (String n:list) {
            System.out.println(list);
        }
    }
}
