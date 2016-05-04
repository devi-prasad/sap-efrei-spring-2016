import java.net.URI;

class PremiumMessenger implements Messenger {
    public int open() {
    	return Status.OK;
    }

    public int send(URI recipient, String msg) {
    	return Status.OK;
    }

    public int receive(URI recipient, String msg) {
    	return Status.OK;
    }

    public int close() {
    	return Status.OK;
    }
}