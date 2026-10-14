package no.nordicsemi.android.swaroeditdevice.node;

import android.os.Bundle;

import dagger.hilt.android.AndroidEntryPoint;
import no.nordicsemi.android.swaroeditdevice.models.ConfigurationClientModel;
import no.nordicsemi.android.swaroeditdevice.transport.MeshMessage;
import no.nordicsemi.android.swaroeditdevice.transport.MeshModel;


@AndroidEntryPoint
public class ConfigurationClientActivity extends BaseModelConfigurationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final MeshModel model = mViewModel.getSelectedModel().getValue();
        if (model instanceof ConfigurationClientModel) {
            disableClickableViews();
        }
    }

    @Override
    protected void updateMeshMessage(final MeshMessage meshMessage) {
        // DO nothing
    }
}
