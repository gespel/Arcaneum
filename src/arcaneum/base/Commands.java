package arcaneum.base;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(commandSender instanceof Player) {
            Player p = ((Player) commandSender).getPlayer();
            if(p != null) {
                if(command.getName().equalsIgnoreCase("credits")) {
                    p.sendMessage("Arcaneum was made by Sten (Gespel) Heimbrodt");
                    Tester x = new Tester(p);
                    x.test();
                }
                else if(command.getName().equalsIgnoreCase("home")) {
                    p.teleport(new Location(Bukkit.getWorld("world"), -143.0, 71.0, -57.75));
                    p.sendMessage(ChatColor.GREEN + "Willkommen Zuhause!");
                }
                return true;
            }
        }
        return false;
    }
}
