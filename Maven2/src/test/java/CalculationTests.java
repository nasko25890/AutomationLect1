import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculationTests {

    @DataProvider(name = "generateNumbers")
    public Object[][] generateNumbers() {

        Object[][] objects = {{2, 3, 5}, {16, 7, 9}, {5, 2, 1}, {4, 2, 2}};
        return objects;
    }

    @Test(groups = "sum", dataProvider = "generateNumbers")
    public void testDataSumOfParameters(int a, int b, int expectedSum) {
        int sum = a + b;
        Assert.assertEquals(expectedSum, sum);
    }

    @Test(groups = "subtraction" , dataProvider = "generateNumbers")
    public void testDataSubtractionParameters(int a, int b, int expectedDifference) {
        int subtraction = a - b;
        Assert.assertEquals(expectedDifference, subtraction);
    }

    @Test(groups = "multiplication", dataProvider = "generateNumbers")
    public void testDataMultiplicationParameters(int a, int b, int result) {
        int multiplication = a * b;
        Assert.assertEquals(result, multiplication);

    }

    @Test(groups = "division", dataProvider = "generateNumbers")
    public void testDataDivisionParameters(int a, int b, int resultOfDivision) {
        int division = a / b;
        Assert.assertEquals(resultOfDivision, division);

    }

    @Test(groups = "ModuleDivision", dataProvider = "generateNumbers")
    public void testDataModuleDivisionParameters(int a, int b, int resultModuleDivision) {
        int moduleDivision = a * b;
        Assert.assertEquals(resultModuleDivision, moduleDivision);

    }



}
