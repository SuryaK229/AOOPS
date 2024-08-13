// Decorator
abstract class PlayerDecorator implements MusicPlayer {
    protected MusicPlayer decoratedPlayer;

    public PlayerDecorator(MusicPlayer decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
    }
}

class EqualizerDecorator extends PlayerDecorator {
    public EqualizerDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Applying equalizer settings...");
    }
}

class VolumeControlDecorator extends PlayerDecorator {
    public VolumeControlDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Adjusting volume...");
    }
}
