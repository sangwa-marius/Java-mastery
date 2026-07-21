

public class Room {
    private String roomName;
    private double size;

    public Room(String roomName, double size){
        if(roomName.isBlank()){
            System.err.println("The room name is required");
            return;
        }else if(size <= 0){
            System.err.println("The room size should be greater than 0");
            return;
        }else{
            this.roomName = roomName;
            this.size = size;
        }
    }

    public void displayRoom(){
        System.out.println("\nRoom\n------");
        System.out.println(roomName);
        System.out.println(size+"m²");
    }


}
