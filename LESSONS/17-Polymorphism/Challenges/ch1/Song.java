

public class Song extends MediaItem {
    @Override
    public void play(){
        System.out.println("Playing a song...");
    }

    @Override
    public void displayInfo(){
        System.out.println("Displaing song information...");
    }

    public void showSubtitles(){
        System.out.println("Showing subtitles for song...");
    }
}
