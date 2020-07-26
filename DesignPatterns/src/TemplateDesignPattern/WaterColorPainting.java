package TemplateDesignPattern;

public class WaterColorPainting extends PaintingTemplate {
    @Override
    public void selectPaints() {
        System.out.println("Nicol WaterColors selected");

    }

    @Override
    public void selectPaperType() {
        System.out.println("Pressed paper selected");

    }

    @Override
    public void selectBrushes() {
        System.out.println("Flat brushes and rollers are selected");

    }
}
