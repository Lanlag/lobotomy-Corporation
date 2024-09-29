package net.uniego.aida.lobecorp;

import net.fabricmc.api.ModInitializer;
import net.uniego.aida.lobecorp.init.*;

public class LobeCorpMain implements ModInitializer {
    public static final String MOD_ID = "lobecorp";

    @Override
    public void onInitialize() {
        EventInit.registerServerEvents();
        EffectInit.register();
        PayloadInit.register();
        ItemInit.register();
        ItemGroupInit.register();
        ScreenInit.registerScreenHandler();
        ComponentInit.register();
        EntityInit.register();

        NetworkInit.registerServer();
    }
}
