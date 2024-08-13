public class App {
    public static void main(String[] args) {
        MusicSource localFile = new LocalFileAdapter(new LocalFile());
        MusicSource onlineStream = new OnlineStreamAdapter(new OnlineStream());
        MusicSource radioStation = new RadioStationAdapter(new RadioStation());

        MusicPlayer player = new BasicPlayer(localFile);
        System.out.println("Playing Local File:");
        player.play();

        System.out.println("Playing Online Stream with Equalizer");
        MusicPlayer playerWithEqualizer = new EqualizerDecorator(new BasicPlayer(onlineStream));
        playerWithEqualizer.play();

        System.out.println("\nPlaying Radio Station with Volume Control");
        MusicPlayer playerWithVolumeControl = new VolumeControlDecorator(new BasicPlayer(radioStation));
        playerWithVolumeControl.play();
    }
}
