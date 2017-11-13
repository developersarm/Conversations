package in.gndec.paigaam.ui;

public interface UiInformableCallback<T> extends UiCallback<T> {
    void inform(String text);
}
