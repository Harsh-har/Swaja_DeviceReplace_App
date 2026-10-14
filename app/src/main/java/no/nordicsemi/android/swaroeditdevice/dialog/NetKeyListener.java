package no.nordicsemi.android.swaroeditdevice.dialog;

import androidx.annotation.NonNull;
import no.nordicsemi.android.swaroeditdevice.NetworkKey;

public interface NetKeyListener {

    void onKeyUpdated(@NonNull final NetworkKey key);

    void onKeyNameUpdated(@NonNull final String nodeName);
}
