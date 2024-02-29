package arcaneum;

import arcaneum.base.Commands;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Arcaneum extends JavaPlugin {
    public void onEnable() {
        System.out.println("Arcaneum starting!");
        setCommandExecutors();
    }

    public void setCommandExecutors() {
        getCommand("credits").setExecutor(new Commands());
    }
}
