package net.panther0706.pkm;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;

public class PKMDragonsBreath extends PKMScorchedEarth {
    public PKMDragonsBreath(Tier pTier, int pAttackDamageModifier, float pAttackSpeedMultiplier, Item.Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedMultiplier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pAttacker.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,120));
        pAttacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,120));
        pAttacker.addEffect(new MobEffectInstance(MobEffects.HEAL, 10));
        pTarget.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 120));
        pTarget.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 120));
        pTarget.addEffect(new MobEffectInstance(MobEffects.WITHER, 20));
        pTarget.addEffect(new MobEffectInstance(MobEffects.GLOWING, 1200));
        pTarget.setSecondsOnFire(15);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    @Override
    public Rarity getRarity(ItemStack p_41461_) {
        return Rarity.EPIC;
    }
}
