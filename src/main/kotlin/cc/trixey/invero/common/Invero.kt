package cc.trixey.invero.common

import cc.trixey.invero.common.api.InveroAPI
import taboolib.common.LifeCycle
import taboolib.common.platform.Awake
import taboolib.common.platform.PlatformFactory
import taboolib.common.platform.Plugin
import taboolib.common.platform.function.console
import taboolib.platform.util.bukkitPlugin

/**
 * Invero
 * cc.trixey.invero.common.Invero
 *
 * @author Arasple
 * @since 2023/2/1 17:13
 */
object Invero : Plugin() {

    val API: InveroAPI by lazy { PlatformFactory.getAPI() }
    
    override fun onEnable() {
        """
        §3 ___
        §3|_ _|§b_ ____   §3_____ §b_ __ §3______
        §3 | |§b| '_ \\ \\ §3/ / §b_ \\ '__§3/ _ \\
        §3 | |§b| | | \\ §3V /  §b__/ |   §3| (_) |
        §3|___|§b_| |_|\\§3_/ \\§b___|_|  §3\\___/
        """.lines().forEach { console().sendMessage(it) }
        
    }
}