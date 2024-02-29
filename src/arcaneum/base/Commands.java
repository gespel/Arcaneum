package arcaneum.base;

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
                return true;
            }
        }
        return false;
    }
}
