public class QuantityMeasurementApp {

    public static void main(String[] args) {

        System.out.println("===== UC5 CONVERSION =====");

        System.out.println("1 FEET = " +
                QuantityLength.convert(1.0, LengthUnit.FEET, LengthUnit.INCHES) + " INCHES");

        System.out.println("3 YARDS = " +
                QuantityLength.convert(3.0, LengthUnit.YARDS, LengthUnit.FEET) + " FEET");

        System.out.println("\n===== UC6 ADDITION =====");

        QuantityLength l1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength l2 = new QuantityLength(12.0, LengthUnit.INCHES);

        System.out.println(l1 + " + " + l2 + " = " + l1.add(l2));

        QuantityLength l3 = new QuantityLength(12.0, LengthUnit.INCHES);
        QuantityLength l4 = new QuantityLength(1.0, LengthUnit.FEET);

        System.out.println(l3 + " + " + l4 + " = " + l3.add(l4));
    }
}