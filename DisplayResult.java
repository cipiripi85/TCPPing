package TCPPing;

import java.util.TimerTask;

public class DisplayResult extends TimerTask {
    Message _m;
    public DisplayResult(Message m){
        _m = m;
    }
    public void run() {
        _m.SetMessageCount();
        _m.DisplayMessage();
        _m.ResetValues();
    }
}
