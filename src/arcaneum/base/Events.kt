package arcaneum.base

import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Arrow
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerLevelChangeEvent
import org.bukkit.inventory.EquipmentSlot
import org.bukkit.inventory.ItemStack

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

    @EventHandler
    fun onSpellCast(event: PlayerInteractEvent) {
        if(event.player.inventory.itemInMainHand == ItemStack(Material.STONE_SWORD, 1) && event.hand?.equals(EquipmentSlot.HAND) == true) {
            event.player.launchProjectile(Arrow::class.java, event.player.location.direction)
        }

    }
}