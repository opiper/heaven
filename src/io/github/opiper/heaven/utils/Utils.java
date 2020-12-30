package io.github.opiper.heaven.utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Utils {
	
	public static String chat (String s) {
		return ChatColor.translateAlternateColorCodes('&', s);
	}
	
	public static ItemStack createItem(Inventory inv, String materialId, int amount, int invSlot, String displayName, String... loreString) {
		
		ItemStack item;
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<String> lore = new ArrayList();
		
		item = new ItemStack(Material.matchMaterial(materialId), amount);
		
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat(displayName));
		for (String s: loreString) {
			lore.add(Utils.chat(s));
			
		}
		meta.setLore(lore);
		item.setItemMeta(meta);
		inv.setItem(invSlot - 1, item);
		
		return item;
		
	}
	
	@SuppressWarnings("deprecation")
	public static ItemStack createItemByte(Inventory inv, String materialId, int byteId, int amount, int invSlot, String displayName, String... loreString) {
		
		ItemStack item;
		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<String> lore = new ArrayList();
		
		item = new ItemStack(Material.matchMaterial(materialId), amount, (short) byteId);
		
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat(displayName));
		for (String s: loreString) {
			lore.add(Utils.chat(s));
			
		}
		meta.setLore(lore);
		item.setItemMeta(meta);
		inv.setItem(invSlot - 1, item);
		
		return item;
		
	}


}
