package no.nordicsemi.android.swaroeditdevice.transport;


import androidx.annotation.NonNull;
import no.nordicsemi.android.swaroeditdevice.ApplicationKey;
import no.nordicsemi.android.swaroeditdevice.opcodes.ApplicationMessageOpCodes;
import no.nordicsemi.android.swaroeditdevice.utils.SecureUtils;

public class GenericBatteryGet extends ApplicationMessage {

    private static final String TAG = GenericBatteryGet.class.getSimpleName();
    private static final int OP_CODE = ApplicationMessageOpCodes.GENERIC_BATTERY_GET;

    /**
     * Constructs a Generic Battery Get message
     *
     * @param appKey application key
     */
    public GenericBatteryGet(@NonNull ApplicationKey appKey) {
        super(appKey);
        assembleMessageParameters();
    }

    @Override
    void assembleMessageParameters() {
        mAid = SecureUtils.calculateK4(mAppKey.getKey());
    }

    @Override
    public int getOpCode() {
        return OP_CODE;
    }
}
