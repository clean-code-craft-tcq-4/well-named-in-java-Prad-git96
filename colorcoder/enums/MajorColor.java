package colorcoder.enums;

public enum MajorColor implements Color {
    WHITE(0),
    RED(1),
    BLACK(2),
    YELLOW(3),
    VIOLET(4);

    private int index;

    private MajorColor(int index) {
        this.index = index;
    }

    public static MajorColor fromIndex(int index) {
        for (MajorColor color : MajorColor.values()) {
            if (color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }

    @Override
    public int getIndex() {
        return index;

    }
}