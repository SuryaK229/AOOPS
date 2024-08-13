public class Main {
    public static void main(String[] args) {
        // Adapter Pattern: Play music from a local file
        MusicSource localFile = new LocalFileAdapter(new LocalFile());
        
        MusicPlayer basicPlayer = new BasicPlayer(localFile);
        System.out.println("Basic Player:");
        basicPlayer.play();

        MusicPlayer playerWithVolumeControl = new VolumeControlDecorator(basicPlayer);
        System.out.println("\nPlayer with Volume Control:");
        playerWithVolumeControl.play();
    }
}
