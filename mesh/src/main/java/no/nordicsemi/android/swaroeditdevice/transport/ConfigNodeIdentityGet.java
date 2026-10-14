package no.nordicsemi.android.swaroeditdevice.transport;


import androidx.annotation.NonNull;
import no.nordicsemi.android.swaroeditdevice.NetworkKey;
import no.nordicsemi.android.swaroeditdevice.opcodes.ConfigMessageOpCodes;
import no.nordicsemi.android.swaroeditdevice.utils.MeshParserUtils;

/**
 * Creates the ConfigNodeIdentityGet message.
 */
public class ConfigNodeIdentityGet extends ConfigMessage {

    private static final String TAG = ConfigNodeIdentityGet.class.getSimpleName();
    private static final int OP_CODE = ConfigMessageOpCodes.CONFIG_NODE_IDENTITY_GET;
    private final NetworkKey networkKey;

    /**
     * Constructs ConfigNodeIdentityGet message.
     */
    public ConfigNodeIdentityGet(@NonNull final NetworkKey networkKey) {
        this.networkKey = networkKey;
        assembleMessageParameters();
    }

    @Override
    public int getOpCode() {
        return OP_CODE;
    }

    @Override
    void assembleMessageParameters() {
        final byte[] netKeyIndex = MeshParserUtils.addKeyIndexPadding(networkKey.getKeyIndex());
        mParameters = new byte[]{netKeyIndex[1], (byte) ((netKeyIndex[0] & 0xFF) & 0x0F)};
    }
}
