package custom;

public enum Size {
    SMALL (1),
    MEDIUM (2),
    LARGE (3),
    XLARGE (4);

    private int value;

    Size(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Size{" +
                "value='" + value + '\'' +
                '}';
    }

}
