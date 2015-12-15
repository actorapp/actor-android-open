package im.actor.cloud;

import im.actor.sdk.ActorSDK;
import im.actor.sdk.ActorSDKApplication;
import im.actor.sdk.ActorStyle;

public class MessengerApplication extends ActorSDKApplication {

    @Override
    public void onConfigureActorSDK() {
        ActorSDK.sharedActor().setPushId(209133700967L);

        ActorStyle style = ActorSDK.sharedActor().style;
        // Customize your colors here
    }
}
