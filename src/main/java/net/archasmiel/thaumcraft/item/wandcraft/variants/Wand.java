package net.archasmiel.thaumcraft.item.wandcraft.variants;

import net.archasmiel.thaumcraft.item.wandcraft.FociWear;
import net.archasmiel.thaumcraft.item.wandcraft.VisCraft;
import net.archasmiel.thaumcraft.item.wandcraft.WandAbstract;
import net.archasmiel.thaumcraft.item.wandcraft.WandWeapon;
import net.archasmiel.thaumcraft.materials.CapMaterials;
import net.archasmiel.thaumcraft.materials.RodMaterials;

public class Wand extends WandAbstract implements VisCraft, WandWeapon, FociWear {

    public Wand(Settings settings, RodMaterials rod, CapMaterials cap) {
        super(settings, rod, cap, 0.00f, 1.00f, "wand");
    }





    @Override
    public boolean canWearFoci() {
        return true;
    }

    @Override
    public boolean canVisCraft() {
        return true;
    }

    @Override
    public boolean isWeapon() {
        return false;
    }
}
