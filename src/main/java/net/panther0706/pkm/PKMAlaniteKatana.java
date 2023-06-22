package net.panther0706.pkm;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;

public class PKMAlaniteKatana extends PKMStatusEffectKatana {
    public PKMAlaniteKatana(Tier pTier, int pAttackDamageModifier, float pAttackSpeedMultiplier, Item.Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedMultiplier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pAttacker.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,20));
        pAttacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20));
        pTarget.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200), pAttacker);
        pTarget.setSecondsOnFire(5);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    @Override
    public Rarity getRarity(ItemStack p_41461_) {
        return Rarity.RARE;
    }
}
