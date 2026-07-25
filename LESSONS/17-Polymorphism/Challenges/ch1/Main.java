public class Main {
    public static void main(String[] args){
        MediaItem[] mediaItems = {
            new Song(),
            new Movie(),
            new PodCast()
        };

        for(MediaItem item : mediaItems){
            item.displayInfo();
            item.play();
            
            if(item instanceof Movie movie){
                movie.showSubtitles();
            }
            
            System.out.println();
        }
    }
}
