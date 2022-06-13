
package net.mcreator.essentialadditions.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.essentialadditions.world.inventory.PotionCreatorCreatePotionMenu;
import net.mcreator.essentialadditions.network.PotionCreatorCreatePotionButtonMessage;
import net.mcreator.essentialadditions.EssentialAdditionsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PotionCreatorCreatePotionScreen extends AbstractContainerScreen<PotionCreatorCreatePotionMenu> {
	private final static HashMap<String, Object> guistate = PotionCreatorCreatePotionMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox potionColor;
	EditBox potionEffects;
	EditBox potionAmplifiers;
	EditBox potionDurations;
	EditBox potionName;
	EditBox potionNameColor;
	EditBox potionType;

	public PotionCreatorCreatePotionScreen(PotionCreatorCreatePotionMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 180;
		this.imageHeight = 193;
	}

	private static final ResourceLocation texture = new ResourceLocation("essential_additions:textures/potion_creator_create_potion.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		potionColor.render(ms, mouseX, mouseY, partialTicks);
		potionEffects.render(ms, mouseX, mouseY, partialTicks);
		potionAmplifiers.render(ms, mouseX, mouseY, partialTicks);
		potionDurations.render(ms, mouseX, mouseY, partialTicks);
		potionName.render(ms, mouseX, mouseY, partialTicks);
		potionNameColor.render(ms, mouseX, mouseY, partialTicks);
		potionType.render(ms, mouseX, mouseY, partialTicks);
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
		if (potionColor.isFocused())
			return potionColor.keyPressed(key, b, c);
		if (potionEffects.isFocused())
			return potionEffects.keyPressed(key, b, c);
		if (potionAmplifiers.isFocused())
			return potionAmplifiers.keyPressed(key, b, c);
		if (potionDurations.isFocused())
			return potionDurations.keyPressed(key, b, c);
		if (potionName.isFocused())
			return potionName.keyPressed(key, b, c);
		if (potionNameColor.isFocused())
			return potionNameColor.keyPressed(key, b, c);
		if (potionType.isFocused())
			return potionType.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		potionColor.tick();
		potionEffects.tick();
		potionAmplifiers.tick();
		potionDurations.tick();
		potionName.tick();
		potionNameColor.tick();
		potionType.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Color:", 6, 41, -12829636);
		this.font.draw(poseStack, "Effect:", 5, 57, -12829636);
		this.font.draw(poseStack, "Amp:", 7, 75, -12829636);
		this.font.draw(poseStack, "Duration:", 4, 96, -12829636);
		this.font.draw(poseStack, "Name:", 3, 115, -12829636);
		this.font.draw(poseStack, "Name Color:", 1, 131, -12829636);
		this.font.draw(poseStack, "Type:", 10, 21, -12829636);
		this.font.draw(poseStack, "Make Your Own", 54, 2, -12829636);
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
		potionColor = new EditBox(this.font, this.leftPos + 42, this.topPos + 33, 120, 20, new TextComponent("0")) {
			{
				setSuggestion("0");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:potionColor", potionColor);
		potionColor.setMaxLength(32767);
		this.addWidget(this.potionColor);
		potionEffects = new EditBox(this.font, this.leftPos + 48, this.topPos + 52, 120, 20, new TextComponent("1")) {
			{
				setSuggestion("1");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("1");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("1");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:potionEffects", potionEffects);
		potionEffects.setMaxLength(32767);
		this.addWidget(this.potionEffects);
		potionAmplifiers = new EditBox(this.font, this.leftPos + 46, this.topPos + 71, 120, 20, new TextComponent("1")) {
			{
				setSuggestion("1");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("1");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("1");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:potionAmplifiers", potionAmplifiers);
		potionAmplifiers.setMaxLength(32767);
		this.addWidget(this.potionAmplifiers);
		potionDurations = new EditBox(this.font, this.leftPos + 55, this.topPos + 90, 120, 20, new TextComponent("60")) {
			{
				setSuggestion("60");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("60");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("60");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:potionDurations", potionDurations);
		potionDurations.setMaxLength(32767);
		this.addWidget(this.potionDurations);
		potionName = new EditBox(this.font, this.leftPos + 39, this.topPos + 110, 120, 20, new TextComponent("A Potion")) {
			{
				setSuggestion("A Potion");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("A Potion");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("A Potion");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:potionName", potionName);
		potionName.setMaxLength(32767);
		this.addWidget(this.potionName);
		potionNameColor = new EditBox(this.font, this.leftPos + 56, this.topPos + 129, 120, 20, new TextComponent("red")) {
			{
				setSuggestion("red");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("red");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("red");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:potionNameColor", potionNameColor);
		potionNameColor.setMaxLength(32767);
		this.addWidget(this.potionNameColor);
		this.addRenderableWidget(new Button(this.leftPos + 40, this.topPos + 164, 93, 20, new TextComponent("Create Potion"), e -> {
			if (true) {
				EssentialAdditionsMod.PACKET_HANDLER.sendToServer(new PotionCreatorCreatePotionButtonMessage(0, x, y, z));
				PotionCreatorCreatePotionButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		potionType = new EditBox(this.font, this.leftPos + 42, this.topPos + 15, 120, 20, new TextComponent("normal")) {
			{
				setSuggestion("normal");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("normal");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("normal");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:potionType", potionType);
		potionType.setMaxLength(32767);
		this.addWidget(this.potionType);
	}
}
