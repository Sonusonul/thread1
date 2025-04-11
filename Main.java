

interface Shape {
    void Area();
}

// Abstract class implementing the interface
abstract class Drawable implements Shape {
    // Abstract method
    abstract void draw();
}

// Concrete class implementing the abstract class
c