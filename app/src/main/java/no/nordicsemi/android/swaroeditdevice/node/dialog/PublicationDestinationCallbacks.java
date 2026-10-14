package no.nordicsemi.android.swaroeditdevice.node.dialog;

import androidx.annotation.NonNull;

import no.nordicsemi.android.swaroeditdevice.Group;

/**
 * Publication destination callbacks.
 */
public interface PublicationDestinationCallbacks {

    /**
     * Invoked when publish address set.
     *
     * @param address publish address
     */
    void onPublishAddressSet(int address);

    /**
     * Invoked when publish address set.
     *
     * @param group Group
     */
    void onPublishAddressSet(@NonNull Group group);
}
