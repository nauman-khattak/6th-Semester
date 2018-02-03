package Dirty_or_Clean;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class dirty_clean {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter total no of rooms : ");
        int total_rooms = s.nextInt();

        String[] possible_status = new String[]{"Dirty", "Clean"};
        String[] room_status = new String[total_rooms];

        Random ran = new Random();
        for (int i = 0; i < total_rooms; i++) {
            room_status[i] = possible_status[ran.nextInt(possible_status.length)];
        }
        System.out.println("Before Cleaning, State of Rooms");
        printArray(room_status);

        for (int i = 0; i < room_status.length;) {
            switch (room_status[i]) {
                case "Clean":
                    i++;
                    break;
                case "Dirty":
                    room_status[i] = room_status[i].replace("Dirty", "Clean");
                    i++;
                    break;
            }
        }

        System.out.println("\nAfter cleaning rooms : ");
        printArray(room_status);
    }

    public static void printArray(String array[]) {
        System.out.println(Arrays.asList(array));
    }
}
