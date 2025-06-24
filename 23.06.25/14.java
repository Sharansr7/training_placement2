class Room {
    int roomNo;
    boolean isBooked;

    Room(int roomNo) {
        this.roomNo = roomNo;
    }
}

public class Hotel {
    static Room[] rooms = new Room[5];
    static {
        for (int i = 0; i < rooms.length; i++) rooms[i] = new Room(i + 101);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Book Room 2. Show Available 3. Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter room number: ");
                int rn = sc.nextInt();
                for (Room r : rooms)
                    if (r.roomNo == rn && !r.isBooked) {
                        r.isBooked = true;
                        System.out.println("Room booked.");
                    }
            } else if (ch == 2) {
                for (Room r : rooms)
                    if (!r.isBooked)
                        System.out.println("Room: " + r.roomNo);
            } else break;
        }
    }
}
