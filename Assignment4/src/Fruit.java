


abstract class Fruit {
    private String name;
    private String color;
    private double weight;
    private boolean isFresh;

    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = true;
    }

    public String getName() {
        return name;
    }

    public boolean isFresh1() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    public abstract String taste();

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight;
    }

	protected abstract boolean isFresh();
}


class Apple extends Fruit {
    public Apple(String name, double weight, String color) {
        super(name, color, weight);
    }

    @Override
    public String taste() {
        return "sweet and sour";
    }

	@Override
	protected boolean isFresh() {
		// TODO Auto-generated method stub
		return false;
	}
}

class Mango extends Fruit {
    public Mango(String name, double weight, String color) {
        super(name, color, weight);
    }

    @Override
    public String taste() {
        return "sweet";
    }

	@Override
	protected boolean isFresh() {
		
		return false;
	}
}

class Orange extends Fruit {
    public Orange(String name, double weight, String color) {
        super(name, color, weight);
    }

    @Override
    public String taste() {
        return "sour";
    }

	@Override
	protected boolean isFresh() {
		
		return false;
	}
}


