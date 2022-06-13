
package net.mcreator.essentialadditions.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.Minecraft;

import net.mcreator.essentialadditions.world.inventory.CalculatorMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CalculatorScreen extends AbstractContainerScreen<CalculatorMenu> {
	private final static HashMap<String, Object> guistate = CalculatorMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox param1;
	EditBox operation;
	EditBox param2;
	EditBox output;

	public CalculatorScreen(CalculatorMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 151;
		this.imageHeight = 210;
	}

	private static final ResourceLocation texture = new ResourceLocation("essential_additions:textures/calculator.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		param1.render(ms, mouseX, mouseY, partialTicks);
		operation.render(ms, mouseX, mouseY, partialTicks);
		param2.render(ms, mouseX, mouseY, partialTicks);
		output.render(ms, mouseX, mouseY, partialTicks);
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
		if (param1.isFocused())
			return param1.keyPressed(key, b, c);
		if (operation.isFocused())
			return operation.keyPressed(key, b, c);
		if (param2.isFocused())
			return param2.keyPressed(key, b, c);
		if (output.isFocused())
			return output.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		param1.tick();
		operation.tick();
		param2.tick();
		output.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "OUTPUT:", 57, 142, -12829636);
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
		param1 = new EditBox(this.font, this.leftPos + 14, this.topPos + 7, 120, 20, new TextComponent("1")) {
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
		guistate.put("text:param1", param1);
		param1.setMaxLength(32767);
		this.addWidget(this.param1);
		operation = new EditBox(this.font, this.leftPos + 14, this.topPos + 29, 120, 20, new TextComponent("+")) {
			{
				setSuggestion("+");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("+");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("+");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:operation", operation);
		operation.setMaxLength(32767);
		this.addWidget(this.operation);
		param2 = new EditBox(this.font, this.leftPos + 14, this.topPos + 51, 120, 20, new TextComponent("1")) {
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
		guistate.put("text:param2", param2);
		param2.setMaxLength(32767);
		this.addWidget(this.param2);
		output = new EditBox(this.font, this.leftPos + 14, this.topPos + 155, 120, 20, new TextComponent("2")) {
			{
				setSuggestion("2");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("2");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("2");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:output", output);
		output.setMaxLength(32767);
		this.addWidget(this.output);
	}
}
