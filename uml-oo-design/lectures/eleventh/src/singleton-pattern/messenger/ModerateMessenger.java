import java.net.URI;

class ModerateMessenger implements Messenger {
    private static final int SEND_MAX       = 32;
    private static final int RECV_MAX       = 64;
    private static final int STATE_CLOSED   = 0x0;
    private static final int STATE_OPEN     = 0x1;
    private static final int STATE_IN_ERROR = 0xFFFFFFFF;

    private int sent, received;
    private int state;

    private void reset() {
        state = STATE_CLOSED;
        sent = 0;
        received = 0;
    }

    public ModerateMessenger() {
        reset();
    }
    
    public int open() {
    	return Status.OK;
    }

    public int send(URI recipient, String msg) {
        if (sent < SEND_MAX) {
            ++sent;
            return Status.OK;
        }

        return Status.ERROR;
    }

    public int receive(URI recipient, String msg) {
    	if (received < RECV_MAX) {
    	   ++received;
    	   return Status.OK;
        }

        return Status.ERROR;
    }

    public int close() {
        reset();

    	return Status.OK;
    }
}