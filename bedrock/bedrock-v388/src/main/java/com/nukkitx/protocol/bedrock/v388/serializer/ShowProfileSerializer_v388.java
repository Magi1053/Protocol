package com.nukkitx.protocol.bedrock.v388.serializer;

import com.nukkitx.protocol.bedrock.packet.ShowProfilePacket;
import com.nukkitx.protocol.bedrock.v388.BedrockUtils;
import com.nukkitx.protocol.serializer.PacketSerializer;
import io.netty.buffer.ByteBuf;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ShowProfileSerializer_v388 implements PacketSerializer<ShowProfilePacket> {
    public static final ShowProfileSerializer_v388 INSTANCE = new ShowProfileSerializer_v388();


    @Override
    public void serialize(ByteBuf buffer, ShowProfilePacket packet) {
        BedrockUtils.writeString(buffer, packet.getXuid());
    }

    @Override
    public void deserialize(ByteBuf buffer, ShowProfilePacket packet) {
        packet.setXuid(BedrockUtils.readString(buffer));
    }
}
