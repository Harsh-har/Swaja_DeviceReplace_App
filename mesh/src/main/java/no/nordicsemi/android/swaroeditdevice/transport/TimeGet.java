package no.nordicsemi.android.swaroeditdevice.transport;

import androidx.annotation.NonNull;

import no.nordicsemi.android.swaroeditdevice.ApplicationKey;
import no.nordicsemi.android.swaroeditdevice.opcodes.ApplicationMessageOpCodes;
import no.nordicsemi.android.swaroeditdevice.utils.SecureUtils;

public class TimeGet extends ApplicationMessage {

    public TimeGet(@NonNull final ApplicationKey appKey) {
        super(appKey);
        assembleMessageParameters();
    }

    @Override
    void assembleMessageParameters() {
        mAid = SecureUtils.calculateK4(mAppKey.getKey());
    }

    @Override
    public int getOpCode() {
        return ApplicationMessageOpCodes.TIME_GET;
    }
}
