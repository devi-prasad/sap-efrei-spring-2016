import java.net.URI;

class ModerateAudioPlayer implements AudioPlayer {
    public int open(URI uri) {
        return Status.ERROR;
    }
    
    public void play() {
    }

    public int pause() {
        return Status.ERROR;
    }

    public int resume() {
        return Status.ERROR;
    }
}