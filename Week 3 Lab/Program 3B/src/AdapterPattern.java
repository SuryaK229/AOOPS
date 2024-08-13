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

class OnlineStream {
    public void stream() {
        System.out.println("Streaming music online...");
    }
}

class OnlineStreamAdapter implements MusicSource {
    private OnlineStream onlineStream;

    public OnlineStreamAdapter(OnlineStream onlineStream) {
        this.onlineStream = onlineStream;
    }

    @Override
    public void play() {
        onlineStream.stream();
    }
}

// Adaptee 3: Radio Station
class RadioStation {
    public void tuneIn() {
        System.out.println("Tuning in to radio station...");
    }
}

// Adapter 3: RadioStationAdapter
class RadioStationAdapter implements MusicSource {
    private RadioStation radioStation;

    public RadioStationAdapter(RadioStation radioStation) {
        this.radioStation = radioStation;
    }

    @Override
    public void play() {
        radioStation.tuneIn();
    }
}
