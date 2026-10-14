package no.nordicsemi.android.swaroeditdevice.data;

import androidx.room.Relation;

import java.util.List;

import no.nordicsemi.android.swaroeditdevice.MeshNetwork;
import no.nordicsemi.android.swaroeditdevice.ApplicationKey;

@SuppressWarnings("unused")
class ApplicationKeys {

    public String uuid;

    @Relation(entity = MeshNetwork.class, parentColumn = "mesh_uuid", entityColumn = "mesh_uuid")
    public List<ApplicationKey> applicationKeys;

}
