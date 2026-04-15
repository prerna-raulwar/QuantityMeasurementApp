public class QuantityMeasurementApp {

    static class Quantity {
        private final double value;
        private final String unit;

        public Quantity(double value, String unit) {
            this.value = value;
            this.unit = unit;
        }

        private double toFeet() {

            if (unit.equals("feet")) {
                return value;
            }

            else if (unit.equals("inch")) {
                return value / 12;
            }

            else if (unit.equals("yard")) {
                return value * 3;
            }

            else if (unit.equals("cm")) {
                return value * 0.0328084;
            }

            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;

            if (obj == null || getClass() != obj.getClass()) return false;

            Quantity other = (Quantity) obj;

            return Double.compare(this.toFeet(), other.toFeet()) == 0;
        }
    }

    public static void main(String[] args) {

        Quantity q1 = new Quantity(1.0, "yard");
        Quantity q2 = new Quantity(3.0, "feet");

        System.out.println("Yard vs Feet: " + q1.equals(q2));

        Quantity q3 = new Quantity(1.0, "inch");
        Quantity q4 = new Quantity(2.54, "cm");

        System.out.println("Inch vs CM: " + q3.equals(q4));
    }
}