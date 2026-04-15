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
            } else if (unit.equals("inch")) {
                return value / 12;
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

        Quantity q1 = new Quantity(1.0, "feet");
        Quantity q2 = new Quantity(12.0, "inch");

        System.out.println("Equal: " + q1.equals(q2));
    }
}