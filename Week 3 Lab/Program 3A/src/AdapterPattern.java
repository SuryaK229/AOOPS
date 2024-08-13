// Target Interface
interface MusicSource {
    void play();
}

class LocalFile {
    public void startPlaying() {
        System.out.println("Playing music from local file...");
    }
}

class LocalFileAdapter implements MusicSource {
    private LocalFile localFile;

    public LocalFileAdapter(LocalFile localFile) {
        this.localFile = localFile;
    }

    @Override
    public void play() {
        localFile.startPlaying();
    }
}
