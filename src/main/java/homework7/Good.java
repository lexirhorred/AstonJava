package homework7;

public class Good {
    private final String name;

    public Good(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || getClass() != o.getClass()) return false;
        Good good = (Good) o;

        return name != null ? name.equals(good.name) : good.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
    @Override
    public String toString() {
        return "Good {" +
                "name=" + name + "}";
    }
}
