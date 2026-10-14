package no.nordicsemi.android.swaroeditdevice.transport;

import androidx.annotation.NonNull;

import no.nordicsemi.android.swaroeditdevice.ApplicationKey;
import no.nordicsemi.android.swaroeditdevice.opcodes.ApplicationMessageOpCodes;

public class GenericSceneSetAck extends GenericSceneSet {

    private static final int OP_CODE =
            ApplicationMessageOpCodes.GENERIC_BUTTON_OPCODE_STATUS_ACK;

    public GenericSceneSetAck(@NonNull ApplicationKey appKey,
                              int sceneId,
                              int type,
                              int press,
                              int mode,
                              int device,
                              int sceneState,
                              int tid) {

        super(appKey, sceneId, type, press, mode, device, sceneState, tid);
    }

    @Override
    public int getOpCode() {
        return OP_CODE;
    }
}