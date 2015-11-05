package mincra.magicrod.rod;

import mincra.magicrod.version.Version;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class Barrier_2 extends BukkitRunnable{
	Player player,player2;
	public Barrier_2(Player _player, Player _player2) {
		player=_player;
		player2=_player2;
	}
	@Override
	public void run() {
		Version.playSound(player.getLocation(),Sound.ZOMBIE_METAL, 0.4F, 1F);
		Version.playeffect(player2.getLocation(),"INSTANT_SPELL");
    	player2.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,20*60,2));
    	player.sendMessage(ChatColor.GREEN+player2.getName()+"に結界の杖lv2を使用しました。");
    	player2.sendMessage(ChatColor.GREEN+player.getName()+"から結界の杖lv2の効果を受けました。");
    	this.cancel();
	}

}
