
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elementalessence.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.elementalessence.item.AquaswordItem;
import net.mcreator.elementalessence.ElementalEssenceMod;

public class ElementalEssenceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ElementalEssenceMod.MODID);
	public static final RegistryObject<Item> AQUASWORD = REGISTRY.register("aquasword", () -> new AquaswordItem());
}
