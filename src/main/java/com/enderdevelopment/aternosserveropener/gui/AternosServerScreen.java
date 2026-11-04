package com.enderdevelopment.aternosserveropener.gui;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class AternosServerScreen extends Screen {
    public AternosServerScreen() {
        super(Text.literal("Aternos Server Opener"));
    }

    @Override
    protected void init() {
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Open Server"), button -> {
            // Logic to open Aternos server
        }).dimensions(this.width / 2 - 100, this.height / 2 - 20, 200, 40).build());
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
    }
}