package co.kukurin.drawing.panel;

import co.kukurin.drawing.drawables.Drawable;

import java.util.Collection;

public interface DrawingModel {

    Collection<Drawable> getDrawables();
    void addDrawable(Drawable drawable);

}
