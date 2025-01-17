package net.uniego.aida.lobecorp.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.uniego.aida.lobecorp.item.AbnormalitySpawnEgg;
import net.uniego.aida.lobecorp.item.LobeCorpItem;
import net.uniego.aida.lobecorp.item.badge.badges.*;
import net.uniego.aida.lobecorp.item.ego.gift.EGOGift;
import net.uniego.aida.lobecorp.item.ego.gift.gifts.BearPawsGift;
import net.uniego.aida.lobecorp.item.ego.gift.gifts.JustitiaGift;
import net.uniego.aida.lobecorp.item.ego.gift.gifts.PenitenceGift;
import net.uniego.aida.lobecorp.item.ego.suit.EGOSuit;
import net.uniego.aida.lobecorp.item.ego.suit.suits.PenitenceSuit;
import net.uniego.aida.lobecorp.item.ego.weapon.EGOWeapon;
import net.uniego.aida.lobecorp.item.ego.weapon.weapons.JustitiaWeapon;
import net.uniego.aida.lobecorp.item.ego.weapon.weapons.PenitenceWeapon;
import net.uniego.aida.lobecorp.util.LobeCorpUtil;

//初始化物品栏
public class ItemGroupInit {
    public static final String LOBE_CORP_TAB_NAME = "itemgroup.lobecorp.lobe_corp";//脑叶公司栏
    public static final String EGO_WEAPON_TAB_NAME = "itemgroup.lobecorp.ego_weapon";//E.G.O武器栏
    public static final String EGO_SUIT_TAB_NAME = "itemgroup.lobecorp.ego_suit";//E.G.O护甲栏
    public static final String EGO_GIFT_TAB_NAME = "itemgroup.lobecorp.ego_gift";//E.G.O饰品栏
    public static final String ABNORMALITY_TAB_NAME = "itemgroup.lobecorp.abnormality";//异想体栏
    public static final String BUILDING_TAB_NAME = "itemgroup.lobecorp.building";//建筑栏

    public static final ItemGroup LOBE_CORP_TAB = FabricItemGroup.builder()
            .icon(() -> new ItemStack(LobeCorpItem.LOBECORP_LOGO)).displayName(Text.translatable(LOBE_CORP_TAB_NAME))
            .entries((context, entries) -> {
                entries.add(LobeCorpItem.LOBECORP_LOGO);
                entries.add(LobeCorpItem.BLUE_LEAF);
                entries.add(EGOSuit.CODE_SUIT);
                entries.add(EGOWeapon.CODE_RIOT_STICK);
                entries.add(EGOSuit.STANDARD_SUIT);
                entries.add(EGOWeapon.RED_RIOT_STICK);
                entries.add(EGOWeapon.WHITE_RIOT_STICK);
                entries.add(EGOWeapon.BLACK_RIOT_STICK);
                entries.add(EGOWeapon.PALE_RIOT_STICK);
                entries.add(ControlBadge.CONTROL_BADGE);
                entries.add(InformationBadge.INFORMATION_BADGE);
                entries.add(SecurityBadge.SECURITY_BADGE);
                entries.add(TrainingBadge.TRAINING_BADGE);
                entries.add(CentralCommandBadge.CENTRAL_COMMAND_BADGE);
                entries.add(WelfareBadge.WELFARE_BADGE);
                entries.add(DisciplinaryBadge.DISCIPLINARY_BADGE);
                entries.add(RecordBadge.RECORD_BADGE);
                entries.add(ExtractionBadge.EXTRACTION_BADGE);
                entries.add(ArchitectureBadge.ARCHITECTURE_BADGE);
                entries.add(ItemInit.CHAMBER_CONSOLE);
                entries.add(ItemInit.QLIPHOTH_COUNTER);
                entries.add(ItemInit.SIGNAL_WIRE);
                entries.add(ItemInit.WARNING_LINE);
                entries.add(ItemInit.CONCRETE_WALL);
                entries.add(ItemInit.CONCRETE_PILLAR);
                entries.add(ItemInit.FOCAL_CONCRETE);
                entries.add(ItemInit.DARK_CONCRETE_WALL);
                entries.add(ItemInit.ROOF_DARK_CONCRETE_WALL);
                entries.add(ItemInit.WARNING_BLOCK);
                entries.add(ItemInit.METAL_BLOCK);
            }).build();

    public static final ItemGroup EGO_WEAPON_TAB = FabricItemGroup.builder()
            .icon(() -> new ItemStack(EGOWeapon.STANDARD_TRAINING_EGO_WEAPON)).displayName(Text.translatable(EGO_WEAPON_TAB_NAME))
            .entries((context, entries) -> {
                entries.add(EGOWeapon.STANDARD_TRAINING_EGO_WEAPON);
                entries.add(PenitenceWeapon.PENITENCE_WEAPON);
                entries.add(EGOWeapon.HORN_WEAPON);
                entries.add(EGOWeapon.BEAR_PAWS_WEAPON);
                entries.add(JustitiaWeapon.JUSTITIA_WEAPON);
            }).build();

    public static final ItemGroup EGO_SUIT_TAB = FabricItemGroup.builder()
            .icon(() -> new ItemStack(EGOSuit.STANDARD_TRAINING_EGO_SUIT)).displayName(Text.translatable(EGO_SUIT_TAB_NAME))
            .entries((context, entries) -> {
                entries.add(EGOSuit.STANDARD_TRAINING_EGO_SUIT);
                entries.add(PenitenceSuit.PENITENCE_SUIT);
                entries.add(EGOSuit.HORN_SUIT);
                entries.add(EGOSuit.BEAR_PAWS_SUIT);
                entries.add(EGOSuit.JUSTITIA_SUIT);
                entries.add(EGOSuit.FLESH_BOUND_SUIT);
            }).build();

    public static final ItemGroup EGO_GIFT_TAB = FabricItemGroup.builder()
            .icon(() -> new ItemStack(EGOGift.STANDARD_TRAINING_EGO_GIFT)).displayName(Text.translatable(EGO_GIFT_TAB_NAME))
            .entries((context, entries) -> {
                entries.add(EGOGift.STANDARD_TRAINING_EGO_GIFT);
                entries.add(PenitenceGift.PENITENCE_GIFT);
                entries.add(EGOGift.HORN_GIFT);
                entries.add(BearPawsGift.BEAR_PAWS_GIFT);
                entries.add(JustitiaGift.JUSTITIA_GIFT);
                entries.add(EGOGift.BLESS_GIFT);
            }).build();

    public static final ItemGroup ABNORMALITY_TAB = FabricItemGroup.builder()
            .icon(() -> new ItemStack(AbnormalitySpawnEgg.STANDARD_TRAINING_DUMMY_RABBIT_EGG)).displayName(Text.translatable(ABNORMALITY_TAB_NAME))
            .entries((context, entries) -> {
                entries.add(AbnormalitySpawnEgg.STANDARD_TRAINING_DUMMY_RABBIT_EGG);
                entries.add(AbnormalitySpawnEgg.ONE_SIN_AND_HUNDREDS_OF_GOOD_DEEDS_EGG);
                entries.add(AbnormalitySpawnEgg.BEAUTY_AND_THE_BEAST_EGG);
                entries.add(AbnormalitySpawnEgg.HAPPY_TEDDY_BEAR_EGG);
                entries.add(AbnormalitySpawnEgg.JUDGEMENT_BIRD_EGG);
                entries.add(ItemInit.CONTAINER_BOX_O_02_62);
            }).build();

//    public static final ItemGroup BUILDING_TAB = FabricItemGroup.builder()
//            .icon(() -> new ItemStack(BlockInit.QLIPHOTH_COUNTER)).displayName(Text.translatable(BUILDING_TAB_NAME))
//            .entries((context, entries) -> {
//                entries.add(ItemInit.CHAMBER_CONSOLE);
//                entries.add(ItemInit.QLIPHOTH_COUNTER);
//            }).build();

    public static void register() {
        Registry.register(Registries.ITEM_GROUP, LobeCorpUtil.id("lobe_corp_tab"), LOBE_CORP_TAB);
//        Registry.register(Registries.ITEM_GROUP, LobeCorpUtil.id("building_tab"), BUILDING_TAB);
        Registry.register(Registries.ITEM_GROUP, LobeCorpUtil.id("ego_weapon_tab"), EGO_WEAPON_TAB);
        Registry.register(Registries.ITEM_GROUP, LobeCorpUtil.id("ego_suit_tab"), EGO_SUIT_TAB);
        Registry.register(Registries.ITEM_GROUP, LobeCorpUtil.id("ego_gift_tab"), EGO_GIFT_TAB);
        Registry.register(Registries.ITEM_GROUP, LobeCorpUtil.id("abnormality_tab"), ABNORMALITY_TAB);
    }
}
