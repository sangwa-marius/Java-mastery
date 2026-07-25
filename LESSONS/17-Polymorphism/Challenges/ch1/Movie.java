public class Movie extends MediaItem {

    @Override
    public void play(){
        System.out.println("Playing a movie...");
    }

    @Override
    public void displayInfo(){
        System.out.println("Displaying information for movie...");
    }

    public void showSubtitles(){
        System.out.println("Showing subtitles for a movie...");
    }
}
