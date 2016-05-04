import java.net.URI;

class BasicMessenger implements Messenger {
	public BasicMessenger() {}
	
    public int open() {
    	return Status.ERROR;
    }

    public int send(URI recipient, String msg) {
    	return Status.ERROR;
    }

    public int receive(URI recipient, String msg) {
    	return Status.ERROR;
    }

    public int close() {
    	return Status.ERROR;
    }
}