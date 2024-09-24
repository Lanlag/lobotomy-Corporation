package net.uniego.aida.lobecorp.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.uniego.aida.lobecorp.gui.GUIResource;
import net.uniego.aida.lobecorp.init.*;
import net.uniego.aida.lobecorp.item.LobeCorpItem;

import java.util.concurrent.CompletableFuture;

//中文翻译文件生成器
public class ZhCnLang extends FabricLanguageProvider {
    public ZhCnLang(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        //属性名
        translationBuilder.add(AttributeInit.PLAYER_MAX_SANITY_NAME, "最大精神值");
        translationBuilder.add(AttributeInit.PLAYER_MAX_ASSIMILATION_NAME, "最大认知同化值");
        translationBuilder.add(AttributeInit.PLAYER_WORK_SUCCESS_NAME, "工作胜率");
        translationBuilder.add(AttributeInit.PLAYER_WORK_VELOCITY_NAME, "工作速率");
        translationBuilder.add(AttributeInit.PLAYER_ATTACK_VELOCITY_NAME, "攻击速率");
        translationBuilder.add(AttributeInit.PLAYER_MOVE_VELOCITY_NAME, "移动速率");
        //死亡信息
        translationBuilder.add(DamageInit.DEATH_ATTACK_DRY, "%1$s渴死了");
        translationBuilder.add(DamageInit.DEATH_ATTACK_DRY_PLAYER, "%1$s在与%2$s战斗中因口渴而死");
        translationBuilder.add(DamageInit.DEATH_ATTACK_INSANE, "%1$s因为发狂死掉了");
        translationBuilder.add(DamageInit.DEATH_ATTACK_INSANE_PLAYER, "%1$s在陷入与%2$s战斗时，因为承受不住疯狂而死了");
        translationBuilder.add(DamageInit.DEATH_ATTACK_MYSTIC, "%1$s被神秘杀死了");
        translationBuilder.add(DamageInit.DEATH_ATTACK_MYSTIC_PLAYER, "%1$s在试图逃离%2$s时被神秘杀死了");
        translationBuilder.add(DamageInit.DEATH_ATTACK_INDIRECT_MYSTIC, "%1$s被%2$s使用神秘杀死");
        translationBuilder.add(DamageInit.DEATH_ATTACK_INDIRECT_MYSTIC_ITEM, "%1$s被%2$s使用%3$s杀死了");
        translationBuilder.add(DamageInit.DEATH_ATTACK_RED, "%2$s致使%1$s死于物理破碎");
        translationBuilder.add(DamageInit.DEATH_ATTACK_RED_PLAYER, "%2$s致使%1$s死于物理破碎");
        translationBuilder.add(DamageInit.DEATH_ATTACK_WHITE, "%2$s致使%1$s死于精神崩溃");
        translationBuilder.add(DamageInit.DEATH_ATTACK_WHITE_PLAYER, "%2$s致使%1$s死于精神崩溃");
        translationBuilder.add(DamageInit.DEATH_ATTACK_BLACK, "%2$s致使%1$s死于侵蚀贯穿");
        translationBuilder.add(DamageInit.DEATH_ATTACK_BLACK_PLAYER, "%2$s致使%1$s死于侵蚀贯穿");
        translationBuilder.add(DamageInit.DEATH_ATTACK_PALE, "%2$s致使%1$s死于灵魂削除");
        translationBuilder.add(DamageInit.DEATH_ATTACK_PALE_PLAYER, "%2$s致使%1$s死于灵魂削除");
        //效果名
        translationBuilder.add(EffectInit.ABSENT.value(), "恍惚");
        translationBuilder.add(EffectInit.ASSIMILATION.value(), "认知同化");
        translationBuilder.add(EffectInit.HYDRATION.value(), "滋润");
        translationBuilder.add(EffectInit.INSANE.value(), "狂乱");
        translationBuilder.add(EffectInit.RESTORATION.value(), "精神恢复");
        translationBuilder.add(EffectInit.SANITY_BOOST.value(), "精神提升");
        translationBuilder.add(EffectInit.THIRST.value(), "干渴");
        translationBuilder.add(EffectInit.INSTANT_SANITY.value(), "瞬间镇定");
        translationBuilder.add(EffectInit.INSTANT_INJURY.value(), "瞬间损伤");
        //物品名
        translationBuilder.add(LobeCorpItem.LOBECORP_LOGO, "脑叶公司Logo");
        translationBuilder.add(LobeCorpItem.BLUE_LEAF, "蓝叶");
        //物品栏名
        translationBuilder.add(ItemGroupInit.LOBECORP_TAB_NAME, "脑叶公司");
        //声音名
        translationBuilder.add(SoundInit.SWALLOW_WATER_ID, "吞水");
        //屏幕名
        translationBuilder.add(ScreenInit.CONTAINER_EQUIPMENT, "装备");
        //按键类名
        translationBuilder.add(KeyInit.CATEGORIES_LOBECORP, "脑叶公司");
        translationBuilder.add(KeyInit.KEY_EQUIPMENT_INVENTORY, "开启/关闭装备");
        //信息名
        translationBuilder.add(GUIResource.STAFF_LEVEL, "职员等级");
        translationBuilder.add(GUIResource.STAFF_FORTITUDE, "勇气");
        translationBuilder.add(GUIResource.STAFF_PRUDENCE, "谨慎");
        translationBuilder.add(GUIResource.STAFF_TEMPERANCE, "自律");
        translationBuilder.add(GUIResource.STAFF_JUSTICE, "正义");
        translationBuilder.add(GUIResource.STAFF_MAX_HEALTH, "最大生命：");
        translationBuilder.add(GUIResource.STAFF_MAX_SANITY, "最大精神：");
        translationBuilder.add(GUIResource.STAFF_WORK_SUCCESS, "工作胜率：");
        translationBuilder.add(GUIResource.STAFF_WORK_VELOCITY, "工作速率：");
        translationBuilder.add(GUIResource.STAFF_ATTACK_VELOCITY, "攻击速率：");
        translationBuilder.add(GUIResource.STAFF_MOVE_VELOCITY, "移动速率：");
        //标签名
        translationBuilder.add(TagInit.HYDRATING_FOODS, "含水食物");
        translationBuilder.add(TagInit.RED_EGO_WEAPONS, "红伤EGO武器");
        translationBuilder.add(TagInit.WHITE_EGO_WEAPONS, "白伤EGO武器");
        translationBuilder.add(TagInit.BLACK_EGO_WEAPONS, "黑伤EGO武器");
        translationBuilder.add(TagInit.PALE_EGO_WEAPONS, "蓝伤EGO武器");
    }
}
