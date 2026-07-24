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

        rwandanSong.displayInfo();
        rwandanSong.singAlong();
        
        onePiece.displayInfo();
        onePiece.showTrailer();

        showBzToday.displayInfo();
        showBzToday.subscribe();
    }
    }
