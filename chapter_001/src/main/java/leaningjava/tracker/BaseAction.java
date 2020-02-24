package leaningjava.tracker;

public abstract class BaseAction implements UserAction {
    private final String name;

    protected BaseAction(final String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }
}

