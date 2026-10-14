package no.nordicsemi.android.swaroeditdevice.transport;


import androidx.annotation.NonNull;
import no.nordicsemi.android.swaroeditdevice.ApplicationKey;
import no.nordicsemi.android.swaroeditdevice.opcodes.ApplicationMessageOpCodes;

/**
 * LightLCModeGet
 */
@SuppressWarnings("unused")
public class LightLCOccupancyModeGet extends ApplicationMessage {

    private static final String TAG = LightLCOccupancyModeGet.class.getSimpleName();
    private static final int OP_CODE = ApplicationMessageOpCodes.LIGHT_LC_OCCUPANCY_MODE_GET;


    /**
     * Constructs LightLCModeGet message.
     *
     * @param appKey {@link ApplicationKey} key for this message
     * @throws IllegalArgumentException if any illegal arguments are passed
     */
    public LightLCOccupancyModeGet(@NonNull final ApplicationKey appKey) throws IllegalArgumentException {
        super(appKey);
        assembleMessageParameters();
    }

    @Override
    public int getOpCode() {
        return OP_CODE;
    }

    @Override
    void assembleMessageParameters() {
        mAid = (byte) mAppKey.getAid();
    }
}
