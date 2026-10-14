package no.nordicsemi.android.swaroeditdevice.data;

import androidx.room.Relation;

import java.util.List;

import no.nordicsemi.android.swaroeditdevice.MeshNetwork;
import no.nordicsemi.android.swaroeditdevice.Provisioner;

@SuppressWarnings("unused")
class Provisioners {

    public String uuid;

    @Relation(entity = MeshNetwork.class, parentColumn = "mesh_uuid", entityColumn = "mesh_uuid")
    public List<Provisioner> provisioners;

}
