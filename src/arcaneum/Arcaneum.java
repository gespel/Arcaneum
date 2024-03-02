package arcaneum;

import arcaneum.base.Commands;
import arcaneum.base.Events;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.units.qual.C;

import java.util.Objects;

public class Arcaneum extends JavaPlugin {
    public void onEnable() {
        System.out.println("Arcaneum starting!");
        setCommandExecutors();
        Bukkit.getPluginManager().registerEvents(new Events(), this);
    }

    public void setCommandExecutors() {
        Objects.requireNonNull(getCommand("credits")).setExecutor(new Commands());
        Objects.requireNonNull(getCommand("home")).setExecutor(new Commands());
    }

}
