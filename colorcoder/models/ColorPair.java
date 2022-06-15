package colorcoder.models;

import colorcoder.constants.ColorConstants;
import colorcoder.enums.MajorColor;
import colorcoder.enums.MinorColor;

public class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;

    public ColorPair(MajorColor major, MinorColor minor) {
        majorColor = major;
        minorColor = minor;
    }

    public MajorColor getMajor() {
        return majorColor;
    }

    public MinorColor getMinor() {
        return minorColor;
    }

    @Override
    public String toString() {
        String colorPairStr = ColorConstants.MAJOR_COLORS[majorColor.getIndex()];
        colorPairStr += "\t";
        colorPairStr += ColorConstants.MINOR_COLORS[minorColor.getIndex()];
        return colorPairStr;
    }
}