package sudochef.guide.bluetooth;

import java.io.IOException;

/**
 * Created by LH-21 on 3/3/2015.
 */
public class HotplateControl extends DeviceControl {
    private final String TAG = "OvenControl";
    private static final String MAC = "30:14:11:25:21:84";
    private static final int Low = 0xFF;
    private static final int High = 0x18;
    private static final int Off = 0x01;


    public HotplateControl() throws IOException {
        super(MAC);
    }

    public void low() throws IOException {
        sendData(Low);
    }

    public void high() throws IOException {
        sendData(High);
    }

    public void off() throws IOException {
        sendData(Off);
    }

    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
    }
}