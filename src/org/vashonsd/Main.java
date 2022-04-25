package org.vashonsd;

public class Main {

    public static void main(String[] args) {
        Holiday christmas = new Holiday(12, 25, "Christmas", "Birth of Jesus Christ", true);

        System.out.println(christmas.isToday());
        christmas.celebrate();

        Holiday thanksgiving = new Holiday(11, 28, "Thanksgiving");

        System.out.println(thanksgiving.getDate());
        System.out.println(thanksgiving.getName());
    }
}
