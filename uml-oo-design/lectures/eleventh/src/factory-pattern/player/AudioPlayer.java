import java.net.URI;

interface AudioPlayer {
	int open(URI uri);
	void play();
	int pause();
	int resume();

}