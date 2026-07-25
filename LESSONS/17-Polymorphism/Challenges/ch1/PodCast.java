public class PodCast extends MediaItem{
    @Override
    public void play(){
        System.out.println("Playing a podcast...");
    }

    @Override
    public void displayInfo(){
        System.out.println("Displaying information for a podcast...");
    }

    public void showSubtitles(){
        System.out.println("Showing subtitles for a podcast...");
    }
}
