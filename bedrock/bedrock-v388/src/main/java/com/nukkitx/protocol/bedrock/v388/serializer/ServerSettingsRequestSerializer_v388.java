package com.nukkitx.protocol.bedrock.v388.serializer;

import com.nukkitx.protocol.bedrock.packet.ServerSettingsRequestPacket;
import com.nukkitx.protocol.serializer.PacketSerializer;
import io.netty.buffer.ByteBuf;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ServerSettingsRequestSerializer_v388 implements PacketSerializer<ServerSettingsRequestPacket> {
    public static final ServerSettingsRequestSerializer_v388 INSTANCE = new ServerSettingsRequestSerializer_v388();


    @Override
    public void serialize(ByteBuf buffer, ServerSettingsRequestPacket packet) {
        // No payload
    }

    @Override
    public void deserialize(ByteBuf buffer, ServerSettingsRequestPacket packet) {
        // No payload
    }
}
