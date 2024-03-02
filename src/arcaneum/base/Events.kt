package arcaneum.base

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.player.PlayerLevelChangeEvent

class Events : Listener {
    @EventHandler
    fun onBlockBreak(event: BlockBreakEvent) {
        event.player.giveExp(1);
    }

    @EventHandler
    fun onLevelUp(event: PlayerLevelChangeEvent) {
        val old = event.oldLevel
        val new = event.newLevel

        if(old < new) {
            event.player.sendMessage("${ChatColor.GREEN}Level up! Level: ${ChatColor.GOLD}${event.player.level}")
        }
    }
}