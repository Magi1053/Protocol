package com.nukkitx.protocol.bedrock.v313.serializer;

import com.nukkitx.network.VarInts;
import com.nukkitx.protocol.bedrock.packet.CameraPacket;
import com.nukkitx.protocol.serializer.PacketSerializer;
import io.netty.buffer.ByteBuf;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CameraSerializer_v313 implements PacketSerializer<CameraPacket> {
    public static final CameraSerializer_v313 INSTANCE = new CameraSerializer_v313();

    @Override
    public void serialize(ByteBuf buffer, CameraPacket packet) {
        VarInts.writeLong(buffer, packet.getCameraUniqueEntityId());
        VarInts.writeLong(buffer, packet.getPlayerUniqueEntityId());
    }

    @Override
    public void deserialize(ByteBuf buffer, CameraPacket packet) {
        packet.setCameraUniqueEntityId(VarInts.readLong(buffer));
        packet.setPlayerUniqueEntityId(VarInts.readLong(buffer));
    }
}
