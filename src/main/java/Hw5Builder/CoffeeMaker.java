package Hw5Builder;

public class CoffeeMaker {

    private final GrainType grain;
    private final MilkType milk;
    private final SizeType size;
    private final int shotEspresso;
    private final boolean caffeine;

    private CoffeeMaker(GrainType grain, MilkType milk, SizeType size, int shotEspresso, boolean caffeine) {
        this.grain = grain;
        this.milk = milk;
        this.size = size;
        this.shotEspresso = shotEspresso;
        this.caffeine = caffeine;
    }

    public static CoffeeBuilder builder(){
        return new CoffeeBuilder();
    }

    public GrainType getGrain() {
        return grain;
    }

    public MilkType getMilk() {
        return milk;
    }

    public SizeType getSize() {
        return size;
    }

    public int getShotEspresso() {
        return shotEspresso;
    }

    public boolean isCaffeine() {
        return caffeine;
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" +
                "grain=" + grain +
                ", milk=" + milk +
                ", size=" + size +
                ", shotEspresso=" + shotEspresso +
                ", caffeine=" + caffeine +
                '}';
    }

    public static class CoffeeBuilder{
        private GrainType grain;
        private MilkType milk;
        private SizeType size;
        private int shotEspresso;
        private boolean caffeine;

        public CoffeeMaker build (){
            return new CoffeeMaker(
                    this.grain,
                    this.milk,
                    this.size,
                    this.shotEspresso,
                    this.caffeine);
        }

        private CoffeeBuilder() {
        }

        public CoffeeBuilder grain(GrainType grain) {
            this.grain = grain;
            return this;
        }

        public CoffeeBuilder milk(MilkType milk) {
            this.milk = milk;
            return this;
        }

        public CoffeeBuilder size(SizeType size) {
            this.size = size;
            return this;
        }

        public CoffeeBuilder shotEspresso(int shotEspresso) {
            this.shotEspresso = shotEspresso;
            return this;
        }

        public CoffeeBuilder caffeine(boolean caffeine) {
            this.caffeine = caffeine;
            return this;
        }
    }

    public enum GrainType {
        ARABICA, ROBSTA
    }

    public enum MilkType {
        OAT, CLASSIC
    }

    public enum SizeType {
        LARGE, SMALL
    }

}
