package net.panther0706.pkm;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class PKMStatusEffectKatana extends SwordItem {
    public PKMStatusEffectKatana(Tier pTier, int pAttackDamageModifier, float pAttackSpeedMultiplier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedMultiplier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pAttacker.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,20));
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    @Override
    public Rarity getRarity(ItemStack p_41461_) {
        return Rarity.UNCOMMON;
    }
}
