package colorcoder.helpers;

import colorcoder.enums.Color;

public class EnumHelper {
    private EnumHelper() {
    }

    public static <E extends Color> E getColorfromIndex(int index, E[] values) {
        for (E e : values) {
            if (e.getIndex() == index) {
                return e;
            }
        }
        return null;
    }
}
