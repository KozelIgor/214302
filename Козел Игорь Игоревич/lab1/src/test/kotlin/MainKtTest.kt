import org.junit.Assert

class MainKtTest {

    @org.junit.Test
    fun nodCalcEuclidOdd() {
        val expected = nodCalcEuclid (390, 27)
        val actual = 3
        Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    fun nodCalcEuclidEven() {
        val expected = nodCalcEuclid (240, 32)
        val actual = 16
        Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    fun nodCalcEuclidBoth() {
        val expected = nodCalcEuclid (560, 63)
        val actual = 7
        Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    fun nodCalcEuclidEqual() {
        val expected = nodCalcEuclid (6, 6)
        val actual = 6
        Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    fun nodCalcEuclidNegative() {
        val expected = nodCalcEuclid (-64, 12)
        val actual = 4
        Assert.assertEquals(expected, actual);
    }
}