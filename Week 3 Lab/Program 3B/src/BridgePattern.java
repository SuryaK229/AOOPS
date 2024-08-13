// Abstraction
interface MusicPlayer {
    void play();
}

class BasicPlayer implements MusicPlayer {
    protected MusicSource musicSource;

    public BasicPlayer(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void play() {
        musicSource.play();
    }
}
