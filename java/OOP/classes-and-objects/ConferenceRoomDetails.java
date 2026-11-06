import java.util.Scanner;

public class ConferenceRoomDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String roomNumber = sc.nextLine();
        String buildingName = sc.nextLine();
        int capacity = sc.nextInt();

        // Input validation
        if (capacity < 1) {
            System.out.println("Error: Capacity must be greater than 0");
            sc.close();
            return;
        }

        ConferenceRoom room =
                new ConferenceRoom(roomNumber, buildingName, capacity);

        room.displayRoomDetails();

        sc.close();
    }
}

class ConferenceRoom {

    private String roomNumber;
    private String buildingName;
    private int capacity;

    ConferenceRoom(String roomNumber, String buildingName, int capacity) {

        this.roomNumber = roomNumber;
        this.buildingName = buildingName;
        this.capacity = capacity;
    }

    void displayRoomDetails() {

        System.out.println("Room Number: " + roomNumber);
        System.out.println("Building: " + buildingName);
        System.out.println("Capacity: " + capacity);
    }
}
