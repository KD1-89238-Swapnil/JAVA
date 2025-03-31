
class NegativeDiameterException extends Exception {
    public NegativeDiameterException(String message) {
        super(message);
    }
}

// Define the Circle class
public class Circle {
    // Attributes
    private double myX;
    private double myY;
    private double myDiameter;

    // Default constructor initializing center to (0, 0) and diameter to 100
    public Circle() {
        this.myX = 0;
        this.myY = 0;
        this.myDiameter = 100;
    }

   
    public Circle(double x, double y, double diameter) throws NegativeDiameterException {
        this.myX = x;
        this.myY = y;
        setDiameter(diameter);  
    }

   
    public double getX() {
        return myX;
    }

    public double getY() {
        return myY;
    }

    public double getDiameter() {
        return myDiameter;
    }

    // Mutator methods (setters)
    public void setX(double x) {
        this.myX = x;
    }

    public void setY(double y) {
        this.myY = y;
    }

    public void setDiameter(double diameter) throws NegativeDiameterException {
        if (diameter < 0) {
            throw new NegativeDiameterException("Diameter cannot be negative!");
        }
        this.myDiameter = diameter;
    }

  
    public void displayCircleDetails() {
        System.out.println("Circle Center: (" + myX + ", " + myY + ")");
        System.out.println("Diameter: " + myDiameter);
    }

  
    public static void main(String[] args) {
        try {
            
            Circle circle1 = new Circle();
            circle1.displayCircleDetails();

            
            Circle circle2 = new Circle(5, 5, 200);
            circle2.displayCircleDetails();

            
            Circle circle3 = new Circle();
            circle3.setDiameter(-50);  
        } catch (NegativeDiameterException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
