public class App {

    public static void main(String[] args) {

        DataTypes dataTypes = new DataTypes();
        System.out.println("Wartość dla stringValue: " + dataTypes.getStringValue());

        DataTypes dataTypes1 = new DataTypes("Wartość nowa dla Stringa");
        System.out.println("Wartość dla stringValue: " + dataTypes1.getStringValue());

        System.out.println(dataTypes.equals(dataTypes));

        System.out.println(dataTypes.toString());

        Address mainAddress = new Address("Słoneczna", 5, "23a", "90-501", "Warszawa");
        Address corespondenceAddress = new Address("Letnia", 10, "2b", "90-502", "Poznań");
        Address vacationAddress = new Address("Wesoła", 53, "3a", "20-501", "Lublin");

        System.out.println(mainAddress.toString());
        mainAddress.setCity("Zakopane");
        System.out.println(mainAddress.getCityName());
        System.out.println(corespondenceAddress.getCityName());
        System.out.println(vacationAddress.getCityName());



    }
}
