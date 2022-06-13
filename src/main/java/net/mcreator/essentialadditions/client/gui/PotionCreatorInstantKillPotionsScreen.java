
package net.mcreator.essentialadditions.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.essentialadditions.world.inventory.PotionCreatorInstantKillPotionsMenu;
import net.mcreator.essentialadditions.network.PotionCreatorInstantKillPotionsButtonMessage;
import net.mcreator.essentialadditions.EssentialAdditionsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PotionCreatorInstantKillPotionsScreen extends AbstractContainerScreen<PotionCreatorInstantKillPotionsMenu> {
	private final static HashMap<String, Object> guistate = PotionCreatorInstantKillPotionsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PotionCreatorInstantKillPotionsScreen(PotionCreatorInstantKillPotionsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("essential_additions:textures/potion_creator_instant_kill_potions.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Instant Kill Potions", 34, 4, -12829636);
		this.font.draw(poseStack, "Types:", 69, 24, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 17, this.topPos + 39, 56, 20, new TextComponent("Normal"), e -> {
			if (true) {
				EssentialAdditionsMod.PACKET_HANDLER.sendToServer(new PotionCreatorInstantKillPotionsButtonMessage(0, x, y, z));
				PotionCreatorInstantKillPotionsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 98, this.topPos + 39, 56, 20, new TextComponent("Splash"), e -> {
			if (true) {
				EssentialAdditionsMod.PACKET_HANDLER.sendToServer(new PotionCreatorInstantKillPotionsButtonMessage(1, x, y, z));
				PotionCreatorInstantKillPotionsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 9, this.topPos + 67, 72, 20, new TextComponent("Lingering"), e -> {
			if (true) {
				EssentialAdditionsMod.PACKET_HANDLER.sendToServer(new PotionCreatorInstantKillPotionsButtonMessage(2, x, y, z));
				PotionCreatorInstantKillPotionsButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 101, this.topPos + 67, 51, 20, new TextComponent("Arrow"), e -> {
			if (true) {
				EssentialAdditionsMod.PACKET_HANDLER.sendToServer(new PotionCreatorInstantKillPotionsButtonMessage(3, x, y, z));
				PotionCreatorInstantKillPotionsButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
