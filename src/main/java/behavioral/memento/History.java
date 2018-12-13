package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<ImageMemento> mementos = new ArrayList<>();

    public void save(Image image) {
        addMemento(getMementoFromImage(image));
    }

    private ImageMemento getMementoFromImage(Image image) {
        return new ImageMemento(image.getWidth(), image.getHeight(),
                image.getBackgroundColor(), image.getState());
    }

    private void addMemento(ImageMemento memento) {
        mementos.add(memento);
    }

    public Image restore(int historyIndex) {
        return getMemento(historyIndex);
    }

    private Image getMemento(int index) {
        return getImageFromMemento(mementos.get(index));
    }

    private Image getImageFromMemento(ImageMemento memento) {
        Image restored = new Image(0, 0, memento.getWidth(), memento.getHeight());

        restored.setBackgroundColor(memento.getBackgroundColor());
        restored.setState(memento.getState());

        return restored;
    }
}
