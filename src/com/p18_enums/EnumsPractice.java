package com.p18_enums;

public enum EnumsPractice {

    SATURDAY, SUNDAY, WEEKDAYS;

    // we can have main method inside enums as well
    public static void main(String[] args) {

        EnumsPractice sunday = EnumsPractice.SUNDAY;
        System.out.println(sunday);

        System.out.println(SATURDAY);

        // values(): it returns arrays of enums constants
        EnumsPractice values[] = EnumsPractice.values();

        for (EnumsPractice val : values){
            // ordinal(): returns index
            System.out.println(val.ordinal());
        }
    }
}
