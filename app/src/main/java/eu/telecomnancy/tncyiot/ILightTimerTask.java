package eu.telecomnancy.tncyiot;

import eu.telecomnancy.tncyiot.Entity.LightsRecordsData;
import android.content.Context;

/**
 * Created by kromer1u on 26/01/17.
 */
public interface ILightTimerTask {
    void myTimerTaskCallback(LightsRecordsData lightsRecordsDataMap);
    Context myTimerTaskContexte();
}