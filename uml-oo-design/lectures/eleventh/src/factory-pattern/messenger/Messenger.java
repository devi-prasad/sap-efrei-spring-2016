import java.net.URI;

interface Messenger {
    int open();
    int send(URI recipient, String msg);
    int receive(URI recipient, String msg);
    int close();
}