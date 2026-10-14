package no.nordicsemi.android.swaroeditdevice.data;

import androidx.room.Relation;

import java.util.List;

import no.nordicsemi.android.swaroeditdevice.MeshNetwork;
import no.nordicsemi.android.swaroeditdevice.NetworkKey;

@SuppressWarnings("unused")
class NetworkKeys {

    public String uuid;

    @Relation(entity = MeshNetwork.class, parentColumn = "mesh_uuid", entityColumn = "mesh_uuid")
    public List<NetworkKey> loadNetworkKeys;

}
