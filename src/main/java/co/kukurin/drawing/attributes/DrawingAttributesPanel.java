package co.kukurin.drawing.attributes;

import co.kukurin.drawing.attributes.components.ColorPickerPanel;

import javax.swing.*;

public class DrawingAttributesPanel extends JPanel {

    private final DrawingAttributes drawingAttributes;
    private final ColorPickerPanel foregroundColorChooser;
    private final ColorPickerPanel backgroundColorChooser;

    public DrawingAttributesPanel(DrawingAttributes drawingAttributes) {
        this.drawingAttributes = drawingAttributes;
        this.foregroundColorChooser = new ColorPickerPanel(drawingAttributes.getSelectedForegroundColor());
        this.backgroundColorChooser = new ColorPickerPanel(drawingAttributes.getSelectedBackgroundColor());

        this.add(this.foregroundColorChooser);
        this.add(this.backgroundColorChooser);
    }

}
