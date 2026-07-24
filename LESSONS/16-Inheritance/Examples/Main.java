public class Main {
    public static void main(String[] args){

        Song rwandanSong = new Song();
        rwandanSong.title = "Ngwino Urare";
        rwandanSong.year = "2026";

        Movie onePiece = new Movie();
        onePiece.title = "One Piece";
        onePiece.year = "2025";

        PodCast showBzToday = new PodCast();
        showBzToday.title = "ShowBs today";
        showBzToday.year = "2024";

        MotorCycle motor1 = new MotorCycle();
        motor1.brand  = "Mahindra";
        motor1.year = "2022";

        Refrigerator ref1 = new Refrigerator("SamSung", 85, 15);
        ref1.displayInfo();
        

        motor1.displayInfo();
        motor1.statEngine();
        motor1.popWheelie();

        rwandanSong.displayInfo();
        rwandanSong.singAlong();
        
        onePiece.displayInfo();
        onePiece.showTrailer();

        showBzToday.displayInfo();
        showBzToday.subscribe();
    }
    }
