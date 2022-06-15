package colorcoder.utils;

import colorcoder.constants.ColorConstants;
import colorcoder.enums.MajorColor;
import colorcoder.enums.MinorColor;
import colorcoder.models.ColorPair;

public class ColorCoderUtils {

    private ColorCoderUtils() {

    }

    public static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / ColorConstants.MAJOR_COLOR_SIZE);
        MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % ColorConstants.MINOR_COLORS_SIZE);
        return new ColorPair(majorColor, minorColor);
    }

    public static int getPairNumberFromColorPair(MajorColor major, MinorColor minor) {
        return major.getIndex() * ColorConstants.MINOR_COLORS_SIZE + minor.getIndex() + 1;
    }

    public static void getColorCodingManual() {
        System.out.println("Color Code | Major color  Minor Color");

        for (int i = 1; i <= 25; i++) {
            System.out.println("\t" + i + "\t" + getColorFromPairNumber(i).toString());
        }
    }
}