// Component
interface MusicPlayer {
    void play();
}

class BasicPlayer implements MusicPlayer {
    private MusicSource musicSource;

    public BasicPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void play() {
        musicSource.play();
    }
}

class VolumeControlDecorator implements MusicPlayer {
    private MusicPlayer decoratedPlayer;

    public VolumeControlDecorator(MusicPlayer decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
        System.out.println("Adjusting volume...");
    }
}
