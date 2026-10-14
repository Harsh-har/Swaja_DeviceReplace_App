package no.nordicsemi.android.swaroeditdevice.provisioners;

import androidx.annotation.NonNull;

import no.nordicsemi.android.swaroeditdevice.Range;

public interface RangeListener {

    void addRange(@NonNull final Range range);

    void updateRange(@NonNull final Range range, final Range newRange);
}
