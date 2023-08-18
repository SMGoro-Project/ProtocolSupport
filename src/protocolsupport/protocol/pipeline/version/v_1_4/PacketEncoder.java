package protocolsupport.protocol.pipeline.version.v_1_4;

import protocolsupport.api.utils.NetworkState;
import protocolsupport.protocol.packet.ClientBoundPacketType;
import protocolsupport.protocol.packet.middle.impl.clientbound.IClientboundMiddlePacketV4;
import protocolsupport.protocol.packet.middle.impl.clientbound.login.noop.NoopLoginSuccess;
import protocolsupport.protocol.packet.middle.impl.clientbound.login.noop.NoopSetCompression;
import protocolsupport.protocol.packet.middle.impl.clientbound.login.v_4__6.LoginDisconnect;
import protocolsupport.protocol.packet.middle.impl.clientbound.login.v_4__7.EncryptionRequest;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopActionbar;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopAdvancements;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopAdvanementsTab;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopBlockChangeAck;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopBlockOpenSignEditor;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopBossBar;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopBundleSeparator;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopCamera;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopCombatBegin;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopCombatDeath;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopCombatEnd;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopCraftRecipeConfirm;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopDeclareCommands;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopDeclareRecipes;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopDeclareTags;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopEntityAttributes;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopEntityLeash;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopGameFeatures;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopLookAt;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopOfflineServerData;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopPlayerListHeaderFooter;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopPlayerMessageDelete;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopResourcePack;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopScoreboardDisplay;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopScoreboardObjective;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopScoreboardScore;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopScoreboardTeam;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopServerDifficulty;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopSetCooldown;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopSetViewCenter;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopStatistics;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopStopSound;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopTitleAnimation;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopTitleClear;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopTitleSubText;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopTitleText;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopUnlockRecipes;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopUpdateSimulationDistance;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopUpdateViewDistance;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopVehicleMove;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopWorldBorderCenter;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopWorldBorderInit;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopWorldBorderLerpSize;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopWorldBorderSize;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopWorldBorderWarnDelay;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopWorldBorderWarnDistance;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopWorldParticle;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4.InventoryOpen;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__16r2.InventoryClose;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__16r2.InventorySetItems;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__16r2.InventorySetSlot;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__16r2.SyncPing;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__18.EntityHurtAnimation;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__18.EntityHurtEvent;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__20.InventoryData;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__20.TimeUpdate;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__5.EntityDestroy;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__5.EntityMetadata;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__5.EntityPassengers;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__5.InventoryHorseOpen;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__5.PlayerAbilities;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__5.PlayerMessage;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__5.SetHealth;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__5.SetPosition;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__5.SystemMessage;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__5.SystemPlayerMessage;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.BlockAction;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.BlockBreakAnimation;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.BlockChangeSingle;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.ChangeDimension;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.EntityAnimation;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.Explosion;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.GameStateChange;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.HeldSlot;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.KickDisconnect;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.SpawnEntity;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.SpawnExpOrb;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.SpawnNamed;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.SpawnPosition;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.StartGame;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.TabComplete;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__6.UpdateMap;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.BlockChangeMulti;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.BlockTileUpdate;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.BookOpen;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.ChunkData;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.ChunkLight;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.ChunkUnload;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.CollectEffect;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.CustomPayload;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.EntityEffectAdd;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.EntityEffectRemove;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.EntityEquipment;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.EntityHeadRotation;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.EntityLook;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.EntityRelMove;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.EntityRelMoveLook;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.EntityStatus;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.EntityTeleport;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.EntityVelocity;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.KeepAlive;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.MerchantTradeList;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.PlayerListRemoveEntry;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.PlayerListSetEntry;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.SetExperience;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__7.WorldEvent;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__8.EntitySound;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__8.WorldSound;
import protocolsupport.protocol.pipeline.IPacketDataChannelIO;
import protocolsupport.protocol.pipeline.version.util.encoder.AbstractPacketEncoder;
import protocolsupport.protocol.storage.netcache.NetworkDataCache;

public class PacketEncoder extends AbstractPacketEncoder<IClientboundMiddlePacketV4> {

	public PacketEncoder(IPacketDataChannelIO io, NetworkDataCache cache) {
		super(io, cache);
		registry.register(NetworkState.LOGIN, ClientBoundPacketType.LOGIN_DISCONNECT, LoginDisconnect::new);
		registry.register(NetworkState.LOGIN, ClientBoundPacketType.LOGIN_ENCRYPTION_BEGIN, EncryptionRequest::new);
		registry.register(NetworkState.LOGIN, ClientBoundPacketType.LOGIN_SET_COMPRESSION, NoopSetCompression::new);
		registry.register(NetworkState.LOGIN, ClientBoundPacketType.LOGIN_SUCCESS, NoopLoginSuccess::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_KEEP_ALIVE, KeepAlive::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_START_GAME, StartGame::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_PLAYER_MESSAGE, PlayerMessage::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SYSTEM_MESSAGE, SystemMessage::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SYSTEM_PLAYER_MESSAGE, SystemPlayerMessage::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_UPDATE_TIME, TimeUpdate::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_EQUIPMENT, EntityEquipment::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SPAWN_POSITION, SpawnPosition::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SET_HEALTH, SetHealth::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_RESPAWN, ChangeDimension::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_POSITION, SetPosition::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_HELD_SLOT, HeldSlot::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_ANIMATION, EntityAnimation::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SPAWN_NAMED, SpawnNamed::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_COLLECT_EFFECT, CollectEffect::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SPAWN_ENTITY, SpawnEntity::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SPAWN_EXP_ORB, SpawnExpOrb::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_VELOCITY, EntityVelocity::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_DESTROY, EntityDestroy::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_REL_MOVE, EntityRelMove::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_LOOK, EntityLook::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_REL_MOVE_LOOK, EntityRelMoveLook::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_TELEPORT, EntityTeleport::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_HEAD_ROTATION, EntityHeadRotation::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_STATUS, EntityStatus::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_LEASH, NoopEntityLeash::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_METADATA, EntityMetadata::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_EFFECT_ADD, EntityEffectAdd::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_EFFECT_REMOVE, EntityEffectRemove::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_SOUND, EntitySound::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_HURT_ANIMATION, EntityHurtAnimation::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_HURT_EVENT, EntityHurtEvent::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SET_EXPERIENCE, SetExperience::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_CHUNK_DATA, ChunkData::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BLOCK_CHANGE_MULTI, BlockChangeMulti::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BLOCK_CHANGE_SINGLE, BlockChangeSingle::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BLOCK_ACTION, BlockAction::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BLOCK_BREAK_ANIMATION, BlockBreakAnimation::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_EXPLOSION, Explosion::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLD_EVENT, WorldEvent::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLD_SOUND, WorldSound::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_GAME_STATE_CHANGE, GameStateChange::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WINDOW_OPEN, InventoryOpen::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WINDOW_HORSE_OPEN, InventoryHorseOpen::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WINDOW_CLOSE, InventoryClose::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WINDOW_SET_SLOT, InventorySetSlot::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WINDOW_SET_ITEMS, InventorySetItems::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WINDOW_DATA, InventoryData::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_UPDATE_MAP, UpdateMap::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BLOCK_TILE, BlockTileUpdate::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_PLAYER_LIST_ENTRY_UPDATE, PlayerListSetEntry::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_PLAYER_LIST_ENTRY_REMOVE, PlayerListRemoveEntry::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_PLAYER_ABILITIES, PlayerAbilities::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_TAB_COMPLETE, TabComplete::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_CUSTOM_PAYLOAD, CustomPayload::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_KICK_DISCONNECT, KickDisconnect::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_PASSENGERS, EntityPassengers::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_CHUNK_UNLOAD, ChunkUnload::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_CHUNK_LIGHT, ChunkLight::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_MERCHANT_TRADE_LIST, MerchantTradeList::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BOOK_OPEN, BookOpen::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SYNC_PING, SyncPing::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SERVER_DIFFICULTY, NoopServerDifficulty::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_COMBAT_BEGIN, NoopCombatBegin::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_COMBAT_END, NoopCombatEnd::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_COMBAT_DEATH, NoopCombatDeath::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLDBORDER_INIT, NoopWorldBorderInit::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLDBORDER_CENTER, NoopWorldBorderCenter::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLDBORDER_LERP_SIZE, NoopWorldBorderLerpSize::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLDBORDER_SIZE, NoopWorldBorderSize::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLDBORDER_WARN_DELAY, NoopWorldBorderWarnDelay::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLDBORDER_WARN_DISTANCE, NoopWorldBorderWarnDistance::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_TITLE_TEXT, NoopTitleText::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_TITLE_SUBTEXT, NoopTitleSubText::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_TITLE_ANIMATION, NoopTitleAnimation::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_TITLE_CLEAR, NoopTitleClear::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ACTIONBAR, NoopActionbar::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_PLAYER_LIST_HEADER_FOOTER, NoopPlayerListHeaderFooter::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_CAMERA, NoopCamera::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SET_COOLDOWN, NoopSetCooldown::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BOSS_BAR, NoopBossBar::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_VEHICLE_MOVE, NoopVehicleMove::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_STATISTICS, NoopStatistics::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_RESOURCE_PACK, NoopResourcePack::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SIGN_EDITOR, NoopBlockOpenSignEditor::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_ATTRIBUTES, NoopEntityAttributes::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLD_PARTICLES, NoopWorldParticle::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SCOREBOARD_DISPLAY_SLOT, NoopScoreboardDisplay::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SCOREBOARD_SCORE, NoopScoreboardScore::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SCOREBOARD_OBJECTIVE, NoopScoreboardObjective::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SCOREBOARD_TEAM, NoopScoreboardTeam::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_UNLOCK_RECIPES, NoopUnlockRecipes::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ADVANCEMENTS, NoopAdvancements::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ADVANCEMENTS_TAB, NoopAdvanementsTab::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_CRAFT_RECIPE_CONFIRM, NoopCraftRecipeConfirm::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_DECLARE_COMMANDS, NoopDeclareCommands::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_DECLARE_RECIPES, NoopDeclareRecipes::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_DECLARE_TAGS, NoopDeclareTags::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_STOP_SOUND, NoopStopSound::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_LOOK_AT, NoopLookAt::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SET_VIEW_CENTER, NoopSetViewCenter::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_UPDATE_VIEW_DISTANCE, NoopUpdateViewDistance::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_UPDATE_SIMULATION_DISTANCE, NoopUpdateSimulationDistance::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BUNDLE_SEPARATOR, NoopBundleSeparator::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SERVER_DATA, NoopOfflineServerData::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_GAME_FEATURES, NoopGameFeatures::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BLOCK_CHANGE_ACK, NoopBlockChangeAck::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_PLAYER_MESSAGE_DELETE, NoopPlayerMessageDelete::new);
	}

}
