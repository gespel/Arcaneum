package arcaneum.base

import org.bukkit.entity.Player

class Tester(val p: Player) {

    fun test() {
        p.sendMessage("from kotlin!")
    }

}