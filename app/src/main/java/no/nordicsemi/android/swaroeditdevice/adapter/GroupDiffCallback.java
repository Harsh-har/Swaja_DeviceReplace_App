package no.nordicsemi.android.swaroeditdevice.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import no.nordicsemi.android.swaroeditdevice.Group;

public class GroupDiffCallback extends DiffUtil.ItemCallback<Group> {

    @Override
    public boolean areItemsTheSame(@NonNull final Group oldItem, @NonNull final Group newItem) {
        return oldItem.equals(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull final Group oldItem, @NonNull final Group newItem) {
        return oldItem.equals(newItem);
    }
}