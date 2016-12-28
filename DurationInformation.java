package TCPPing;

import java.io.IOException;
import java.io.Serializable;
import java.util.Random;

public class DurationInformation implements Serializable {


    Integer _id;
    long _pitcherStartTime;
    long _pitcherEndTime;
    long _catcherStartTime;
    byte[] _additionalData;

    public void SetId(Integer id) {_id = id;}
    public void SetPitcherStartTime (){this._pitcherStartTime =  System.nanoTime();}
    public void SetPitcherEndTime (){this._pitcherEndTime =  System.nanoTime();}
    public void SetCatcherStartTim (){this._catcherStartTime =  System.nanoTime();}

    // calculate time needed to send and receive info
    public float GetSendTime () { return (this._catcherStartTime - this._pitcherStartTime)/1000000.0f;}
    public float GetReceiveTime () { return (this._pitcherEndTime - this._catcherStartTime)/1000000.0f;}
    public float GetTotalTime () { return (this._pitcherEndTime - this._pitcherStartTime)/1000000.0f;}

    public void SetAdditionalData(int size, int usedSize) throws IOException {
            _additionalData = new byte[size-usedSize];
            new Random().nextBytes(_additionalData);
    }

}
