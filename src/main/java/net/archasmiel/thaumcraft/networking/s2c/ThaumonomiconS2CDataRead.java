package net.archasmiel.thaumcraft.networking.s2c;

import net.archasmiel.thaumcraft.screen.thaumonomicon.data.Tabs;
import net.archasmiel.thaumcraft.screen.thaumonomicon.parts.researchview.Tab;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;

public class ThaumonomiconS2CDataRead {

    private ThaumonomiconS2CDataRead() {

    }

    public static void receive(MinecraftClient client, ClientPlayNetworkHandler handler,
                               PacketByteBuf packetIn, PacketSender packetSender)
    {
        float posX;
        float posY;

        for (Tab tab: Tabs.buildTabs()) {
            posX = packetIn.readFloat();
            tab.setBackX(posX);
            posY = packetIn.readFloat();
            tab.setBackY(posY);
        }
    }
}
