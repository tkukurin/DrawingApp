package co.kukurin.drawing.panel;

import co.kukurin.drawing.drawables.Drawable;
import co.kukurin.drawing.drawables.DrawableProducer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
@AllArgsConstructor
public class DrawingPanelState {

    private DrawableProducer activeDrawableProducer;
    private Drawable elementCurrentlyBeingDrawn;
    private Point cachedMousePosition;
    private Point cachedTopLeftReferencePosition;
    private boolean isMouseDown;
    private boolean isSpaceDown;

}