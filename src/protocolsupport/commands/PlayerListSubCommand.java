package protocolsupport.commands;

import java.util.List;
import java.util.stream.Collectors;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import protocolsupport.api.ProtocolSupportAPI;
import protocolsupport.api.ProtocolVersion;
import protocolsupport.api.chat.ChatFormat;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class PlayerListSubCommand implements SubCommand {

	@Override
	public int getMinArgs() {
		return 0;
	}

	@Override
	public boolean handle(CommandSender sender, String[] args) {
		boolean verbose = (args.length == 1) && (args[0].equalsIgnoreCase("v") || args[0].equalsIgnoreCase("verbose"));
		sender.sendMessage(ChatFormat.YELLOW.toStyle() + "ProtocolSupport Players:");
		for (ProtocolVersion version : ProtocolVersionsHelper.ALL) {
			List<String> players = Bukkit.getOnlinePlayers().stream()
			.filter(player -> ProtocolSupportAPI.getProtocolVersion(player) == version)
			.map(Player::getName)
			.collect(Collectors.toList());
			if (!players.isEmpty() || verbose) {
				sender.sendMessage(ChatFormat.YELLOW.toStyle() + "[" + version.getName() + "]: " + ChatFormat.GREEN.toStyle() + String.join(", ", players));
			}
		}
		if (!verbose) {
			sender.sendMessage(ChatFormat.YELLOW.toStyle() + "List all compatible versions using by adding verbose or v argument to this command");
		}
		return true;
	}

	@Override
	public String getHelp() {
		return "prints online players protocol versions";
	}

}
