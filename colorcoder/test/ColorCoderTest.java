package colorcoder.test;

import colorcoder.enums.MajorColor;
import colorcoder.enums.MinorColor;
import colorcoder.models.ColorPair;
import colorcoder.utils.ColorCoderUtils;

public class ColorCoderTest {

    private ColorCoderTest() {

    }

    public static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor) {
        ColorPair colorPair = ColorCoderUtils.getColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.toString());
        assert (colorPair.getMajor() == expectedMajor);
        assert (colorPair.getMinor() == expectedMinor);
    }

    public static void testPairToNumber(MajorColor major, MinorColor minor, int expectedPairNumber) {
        int pairNumber = ColorCoderUtils.getPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert (pairNumber == expectedPairNumber);
    }
}