package protocolsupport.protocol.pipeline.version.v_1_16.r2;

import protocolsupport.api.utils.NetworkState;
import protocolsupport.protocol.packet.ClientBoundPacketType;
import protocolsupport.protocol.packet.middle.impl.clientbound.IClientboundMiddlePacketV16r2;
import protocolsupport.protocol.packet.middle.impl.clientbound.login.v_13__20.LoginCustomPayload;
import protocolsupport.protocol.packet.middle.impl.clientbound.login.v_16r1__18.LoginSuccess;
import protocolsupport.protocol.packet.middle.impl.clientbound.login.v_7__20.LoginDisconnect;
import protocolsupport.protocol.packet.middle.impl.clientbound.login.v_8__20.EncryptionRequest;
import protocolsupport.protocol.packet.middle.impl.clientbound.login.v_8__20.SetCompression;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopBlockChangeAck;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopBundleSeparator;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopGameFeatures;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopOfflineServerData;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopPlayerMessageDelete;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.noop.NoopUpdateSimulationDistance;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_10__18.EntityEffectAdd;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_10__18.WorldSound;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_11__16r2.Actionbar;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_11__16r2.TitleAnimation;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_11__16r2.TitleClear;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_11__16r2.TitleSubText;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_11__16r2.TitleText;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_11__20.CollectEffect;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_12r1__18.Advancements;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_12r1__20.AdvancementsTab;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_13__18.DeclareCommands;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_13__20.CraftRecipeConfirm;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_13__20.CustomPayload;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_13__20.LookAt;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_13__20.QueryNBTResponse;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_13__20.ScoreboardObjective;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_13__20.ScoreboardTeam;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_13__20.StopSound;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_13__20.TabComplete;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__16r2.BlockChangeSingle;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__16r2.DeclareTags;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__16r2.Explosion;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__16r2.InventoryHorseOpen;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__16r2.InventoryOpen;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__16r2.SpawnPosition;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__16r2.UpdateMap;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__17r2.BlockTileUpdate;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__18.EntityMetadata;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__18.EntitySound;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__20.BlockAction;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__20.BlockBreakAnimation;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__20.BlockOpenSignEditor;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__20.BookOpen;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__20.ChunkUnload;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__20.MerchantTradeList;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__20.ServerDifficulty;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__20.SetViewCenter;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__20.UpdateViewDistance;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_14r1__20.WorldEvent;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_15__18.WorldParticle;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_15__20.SpawnNamed;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_15__20.Statistics;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_16r1__16r2.ChunkLight;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_16r1__16r2.EntityAttributes;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_16r1__18.DeclareRecipes;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_16r1__18.PlayerMessage;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_16r1__18.SpawnEntity;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_16r1__18.SystemMessage;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_16r1__18.SystemPlayerMessage;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_16r1__20.EntityEquipment;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_16r2.BlockChangeMulti;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_16r2.ChangeDimension;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_16r2.ChunkData;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_16r2.StartGame;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_16r2__20.UnlockRecipes;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__16r2.InventoryClose;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__16r2.InventorySetItems;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__16r2.InventorySetSlot;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__16r2.SyncPing;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__18.EntityHurtAnimation;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__18.EntityHurtEvent;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__20.EntityStatus;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__20.InventoryData;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__20.ScoreboardDisplay;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_4__20.TimeUpdate;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_6__20.PlayerAbilities;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_7__20.EntityAnimation;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_7__20.GameStateChange;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_7__20.HeldSlot;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_7__20.KickDisconnect;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__16r2.CombatBegin;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__16r2.CombatDeath;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__16r2.CombatEnd;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__16r2.ResourcePack;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__16r2.WorldBorderCenter;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__16r2.WorldBorderInit;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__16r2.WorldBorderLerpSize;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__16r2.WorldBorderSize;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__16r2.WorldBorderWarnDelay;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__16r2.WorldBorderWarnDistance;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__18.PlayerListRemoveEntry;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__18.PlayerListSetEntry;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__20.Camera;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__20.EntityEffectRemove;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__20.EntityHeadRotation;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__20.EntityLook;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__20.KeepAlive;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__20.PlayerListHeaderFooter;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__20.ScoreboardScore;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__20.SetExperience;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_8__20.SetHealth;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_9r1__16r2.EntityDestroy;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_9r1__16r2.SetPosition;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_9r1__20.BossBar;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_9r1__20.EntityLeash;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_9r1__20.EntityPassengers;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_9r1__20.EntityRelMove;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_9r1__20.EntityRelMoveLook;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_9r1__20.EntityTeleport;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_9r1__20.EntityVelocity;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_9r1__20.SetCooldown;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_9r1__20.SpawnExpOrb;
import protocolsupport.protocol.packet.middle.impl.clientbound.play.v_9r1__20.VehicleMove;
import protocolsupport.protocol.packet.middle.impl.clientbound.status.v_7__20.Pong;
import protocolsupport.protocol.packet.middle.impl.clientbound.status.v_7__20.ServerInfo;
import protocolsupport.protocol.pipeline.IPacketDataChannelIO;
import protocolsupport.protocol.pipeline.version.util.encoder.AbstractPacketEncoder;
import protocolsupport.protocol.storage.netcache.NetworkDataCache;

public class PacketEncoder extends AbstractPacketEncoder<IClientboundMiddlePacketV16r2> {

	public PacketEncoder(IPacketDataChannelIO io, NetworkDataCache cache) {
		super(io, cache);
		registry.register(NetworkState.LOGIN, ClientBoundPacketType.LOGIN_SUCCESS, LoginSuccess::new);
		registry.register(NetworkState.LOGIN, ClientBoundPacketType.LOGIN_ENCRYPTION_BEGIN, EncryptionRequest::new);
		registry.register(NetworkState.LOGIN, ClientBoundPacketType.LOGIN_DISCONNECT, LoginDisconnect::new);
		registry.register(NetworkState.LOGIN, ClientBoundPacketType.LOGIN_SET_COMPRESSION, SetCompression::new);
		registry.register(NetworkState.LOGIN, ClientBoundPacketType.LOGIN_CUSTOM_PAYLOAD, LoginCustomPayload::new);
		registry.register(NetworkState.STATUS, ClientBoundPacketType.STATUS_SERVER_INFO, ServerInfo::new);
		registry.register(NetworkState.STATUS, ClientBoundPacketType.STATUS_PONG, Pong::new);
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
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_LEASH, EntityLeash::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_METADATA, EntityMetadata::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_EFFECT_ADD, EntityEffectAdd::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_EFFECT_REMOVE, EntityEffectRemove::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_SOUND, EntitySound::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_HURT_ANIMATION, EntityHurtAnimation::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_HURT_EVENT, EntityHurtEvent::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SET_EXPERIENCE, SetExperience::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_ATTRIBUTES, EntityAttributes::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_CHUNK_DATA, ChunkData::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BLOCK_CHANGE_MULTI, BlockChangeMulti::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BLOCK_CHANGE_SINGLE, BlockChangeSingle::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BLOCK_ACTION, BlockAction::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BLOCK_BREAK_ANIMATION, BlockBreakAnimation::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_EXPLOSION, Explosion::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLD_EVENT, WorldEvent::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLD_SOUND, WorldSound::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLD_PARTICLES, WorldParticle::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_GAME_STATE_CHANGE, GameStateChange::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WINDOW_OPEN, InventoryOpen::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WINDOW_HORSE_OPEN, InventoryHorseOpen::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WINDOW_CLOSE, InventoryClose::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WINDOW_SET_SLOT, InventorySetSlot::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WINDOW_SET_ITEMS, InventorySetItems::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WINDOW_DATA, InventoryData::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_UPDATE_MAP, UpdateMap::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BLOCK_TILE, BlockTileUpdate::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SIGN_EDITOR, BlockOpenSignEditor::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_PLAYER_LIST_ENTRY_UPDATE, PlayerListSetEntry::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_PLAYER_LIST_ENTRY_REMOVE, PlayerListRemoveEntry::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_PLAYER_ABILITIES, PlayerAbilities::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_TAB_COMPLETE, TabComplete::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SCOREBOARD_OBJECTIVE, ScoreboardObjective::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SCOREBOARD_SCORE, ScoreboardScore::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SCOREBOARD_DISPLAY_SLOT, ScoreboardDisplay::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SCOREBOARD_TEAM, ScoreboardTeam::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_CUSTOM_PAYLOAD, CustomPayload::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_RESOURCE_PACK, ResourcePack::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_KICK_DISCONNECT, KickDisconnect::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_CAMERA, Camera::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_PLAYER_LIST_HEADER_FOOTER, PlayerListHeaderFooter::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ENTITY_PASSENGERS, EntityPassengers::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_TITLE_TEXT, TitleText::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_TITLE_SUBTEXT, TitleSubText::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_TITLE_ANIMATION, TitleAnimation::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_TITLE_CLEAR, TitleClear::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ACTIONBAR, Actionbar::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLDBORDER_INIT, WorldBorderInit::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLDBORDER_CENTER, WorldBorderCenter::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLDBORDER_LERP_SIZE, WorldBorderLerpSize::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLDBORDER_SIZE, WorldBorderSize::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLDBORDER_WARN_DELAY, WorldBorderWarnDelay::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_WORLDBORDER_WARN_DISTANCE, WorldBorderWarnDistance::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_CHUNK_UNLOAD, ChunkUnload::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SERVER_DIFFICULTY, ServerDifficulty::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_COMBAT_BEGIN, CombatBegin::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_COMBAT_END, CombatEnd::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_COMBAT_DEATH, CombatDeath::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SET_COOLDOWN, SetCooldown::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BOSS_BAR, BossBar::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_VEHICLE_MOVE, VehicleMove::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ADVANCEMENTS, Advancements::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_ADVANCEMENTS_TAB, AdvancementsTab::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_UNLOCK_RECIPES, UnlockRecipes::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_CRAFT_RECIPE_CONFIRM, CraftRecipeConfirm::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_STATISTICS, Statistics::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_DECLARE_COMMANDS, DeclareCommands::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_DECLARE_RECIPES, DeclareRecipes::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_DECLARE_TAGS, DeclareTags::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_QUERY_NBT_RESPONSE, QueryNBTResponse::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_STOP_SOUND, StopSound::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_LOOK_AT, LookAt::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_CHUNK_LIGHT, ChunkLight::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_MERCHANT_TRADE_LIST, MerchantTradeList::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BOOK_OPEN, BookOpen::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SET_VIEW_CENTER, SetViewCenter::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_UPDATE_VIEW_DISTANCE, UpdateViewDistance::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SYNC_PING, SyncPing::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_UPDATE_SIMULATION_DISTANCE, NoopUpdateSimulationDistance::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BUNDLE_SEPARATOR, NoopBundleSeparator::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_SERVER_DATA, NoopOfflineServerData::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_GAME_FEATURES, NoopGameFeatures::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_BLOCK_CHANGE_ACK, NoopBlockChangeAck::new);
		registry.register(NetworkState.PLAY, ClientBoundPacketType.PLAY_PLAYER_MESSAGE_DELETE, NoopPlayerMessageDelete::new);
	}

}
