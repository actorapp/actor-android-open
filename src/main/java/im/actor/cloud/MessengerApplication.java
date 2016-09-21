package im.actor.cloud;

import im.actor.sdk.ActorSDKApplication;
import im.actor.sdk.ActorSDK;

public class MessengerApplication extends ActorSDKApplication {
    @Override
    public void onConfigureActorSDK() {
        ActorSDK.sharedActor().setCallsEnabled(true);
        ActorSDK.sharedActor().setVideoCallsEnabled(true);
        ActorSDK.sharedActor().setFastShareEnabled(true);
    }
}
