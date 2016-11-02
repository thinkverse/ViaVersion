package us.myles.ViaVersion.protocols.protocol1_9to1_8.providers;

import us.myles.ViaVersion.api.data.UserConnection;
import us.myles.ViaVersion.api.platform.providers.Provider;
import us.myles.ViaVersion.protocols.protocol1_9to1_8.storage.EntityTracker;

public class EntityIdProvider implements Provider {

    public int getEntityId(UserConnection user) throws Exception {
        return user.get(EntityTracker.class).getEntityID();
    }
}
