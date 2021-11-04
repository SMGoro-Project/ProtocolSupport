package protocolsupport.protocol.packet.middle.impl.clientbound.play.v_15_16r1_16r2_17r1_17r2;

import protocolsupport.protocol.codec.UUIDCodec;
import protocolsupport.protocol.codec.VarNumberCodec;
import protocolsupport.protocol.packet.ClientBoundPacketData;
import protocolsupport.protocol.packet.ClientBoundPacketType;
import protocolsupport.protocol.packet.middle.base.clientbound.play.MiddleSpawnNamed;
import protocolsupport.protocol.packet.middle.impl.clientbound.IClientboundMiddlePacketV15;
import protocolsupport.protocol.packet.middle.impl.clientbound.IClientboundMiddlePacketV16r1;
import protocolsupport.protocol.packet.middle.impl.clientbound.IClientboundMiddlePacketV16r2;
import protocolsupport.protocol.packet.middle.impl.clientbound.IClientboundMiddlePacketV17r1;
import protocolsupport.protocol.packet.middle.impl.clientbound.IClientboundMiddlePacketV17r2;

public class SpawnNamed extends MiddleSpawnNamed implements
IClientboundMiddlePacketV15,
IClientboundMiddlePacketV16r1,
IClientboundMiddlePacketV16r2,
IClientboundMiddlePacketV17r1,
IClientboundMiddlePacketV17r2 {

	public SpawnNamed(IMiddlePacketInit init) {
		super(init);
	}

	@Override
	protected void write() {
		ClientBoundPacketData spawnnamed = ClientBoundPacketData.create(ClientBoundPacketType.PLAY_SPAWN_NAMED);
		VarNumberCodec.writeVarInt(spawnnamed, entity.getId());
		UUIDCodec.writeUUID2L(spawnnamed, entity.getUUID());
		spawnnamed.writeDouble(x);
		spawnnamed.writeDouble(y);
		spawnnamed.writeDouble(z);
		spawnnamed.writeByte(yaw);
		spawnnamed.writeByte(pitch);
		io.writeClientbound(spawnnamed);
	}

}
