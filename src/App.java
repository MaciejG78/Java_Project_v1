public class App {

    public static void main(String[] args) {

        ConditionsStatements conditionsStatements = new ConditionsStatements();

        System.out.println(conditionsStatements.comparingIfXBiggerThanY(10, 10));

        System.out.println(conditionsStatements.comparingShortIfXBiggerThanY(50, 10));
        System.out.println(conditionsStatements.comparingShortIfXBiggerThanY(5, 10));
        System.out.println(conditionsStatements.comparingShortIfXBiggerThanY(50, 50));




//        Address address1 = new Address("warszawski", "Warszawa", "Spokojna", 1 , "2b", "90-950");
//        Address address2 = new Address("łódzki", "Łódź", "Cicha", 4, "5346", "33-435");
//
//        AddressMain address3 = new AddressMain("Wioska Serfów", "Łódź", "Cicha", 4, "5346", "33-435");
//
//
//        System.out.println(address1.getStreetWithNumbers());
//        System.out.println(address2.getStreetWithNumbers());
//        System.out.println(address3.getStreetWithNumbers());
//
//        address1.showCountyName();
//        System.out.println("Testowy tekst: " + address1.county);
//
//
//


//        DataTypes dataTypes = new DataTypes();
//        System.out.println("Wartość dla stringValue: " + dataTypes.getStringValue());
//
//        DataTypes dataTypes1 = new DataTypes("Wartość nowa dla Stringa");
//        System.out.println("Wartość dla stringValue: " + dataTypes1.getStringValue());
//
//        System.out.println(dataTypes.equals(dataTypes));
//
//        System.out.println(dataTypes.toString());
//
//        AddressTemplate mainAddress = new AddressTemplate("Słoneczna", 5, "23a", "90-501", "Warszawa");
//        AddressTemplate corespondenceAddress = new AddressTemplate("Letnia", 10, "2b", "90-502", "Poznań");
//        AddressTemplate vacationAddress = new AddressTemplate("Wesoła", 53, "3a", "20-501", "Lublin");
//
//        System.out.println(mainAddress.toString());
//        mainAddress.setCity("Zakopane");
//        System.out.println(mainAddress.getCityName());
//        System.out.println(corespondenceAddress.getCityName());
//        System.out.println(vacationAddress.getCityName());



    }
}
