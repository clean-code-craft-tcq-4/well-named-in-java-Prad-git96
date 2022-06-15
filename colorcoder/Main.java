package colorcoder;

import colorcoder.enums.MajorColor;
import colorcoder.enums.MinorColor;
import colorcoder.test.ColorCoderTest;

public class Main {

    public static void main(String[] args) {
        ColorCoderTest.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorCoderTest.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

        ColorCoderTest.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorCoderTest.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
