public class BuilderTest {
    public static void main(String[] args) {
        Computer lowBudgetComputer = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("4GB")
            .setStorage("1TB HDD")
            .build();
	Computer highBudgetComputer = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("16GB")
            .setStorage("2TB SSD")
            .build();

        System.out.println(lowBudgetComputer);
 	System.out.println(highBudgetComputer);
    }
}
