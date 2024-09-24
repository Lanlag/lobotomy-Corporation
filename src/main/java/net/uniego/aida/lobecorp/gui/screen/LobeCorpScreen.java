package net.uniego.aida.lobecorp.gui.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.AbstractInventoryScreen;
import net.minecraft.client.gui.widget.TexturedButtonWidget;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.uniego.aida.lobecorp.gui.GUIResource;
import net.uniego.aida.lobecorp.init.KeyInit;

import static net.minecraft.client.gui.screen.ingame.InventoryScreen.drawEntity;

//脑叶公司屏幕
@Environment(EnvType.CLIENT)
public class LobeCorpScreen extends AbstractInventoryScreen<LobeCorpScreenHandler> {
    private final EGOGiftWidget egoGiftWidget = new EGOGiftWidget();

    public LobeCorpScreen(LobeCorpScreenHandler screenHandler, PlayerInventory playerInventory, Text text) {
        super(screenHandler, playerInventory, text);
    }

    @Override
    protected void init() {
        super.init();
        egoGiftWidget.initialize(x, y, handler);
        addDrawableChild(new TexturedButtonWidget(x + 10, y + 10, 10, 10, GUIResource.EGO_GIFT_BUTTON,
                button -> {
                    egoGiftWidget.toggleOpen();
                    if (!egoGiftWidget.isOpen()) egoGiftWidget.closeSlot();
                }));
        addSelectableChild(egoGiftWidget);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        egoGiftWidget.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }

    @Override
    protected void drawForeground(DrawContext context, int mouseX, int mouseY) {
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        context.drawTexture(GUIResource.LOBECORP_INVENTORY, x, y, 0, 0, backgroundWidth, backgroundHeight);
        if (client != null && client.player != null) {
            drawEntity(context, x + 26 - 33, y + 8, x + 75, y + 78, 30, 0.0625F, mouseX, mouseY, client.player);
        }
    }

    @Override
    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        if (KeyInit.EQUIPMENT_INVENTORY.matchesKey(keyCode, scanCode)) {
            close();
            return true;
        }
        return super.keyPressed(keyCode, scanCode, modifiers);
    }

    @Override
    protected boolean isClickOutsideBounds(double mouseX, double mouseY, int left, int top, int button) {
        boolean bl = mouseX < (double) left || mouseY < (double) top || mouseX >= (double) (left + backgroundWidth) || mouseY >= (double) (top + backgroundHeight);
        return egoGiftWidget.isClickOutsideBounds(mouseX, mouseY, x, y, backgroundWidth, backgroundHeight) && bl;
    }
}
