package java1201;

/**
 * 使用多型
 * */

// 提出一個General的類別
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Class representing a Circle
class Circle extends Shape{
    @Override
    void draw() { // 覆寫父類方法
        System.out.println("Drawing a circle");
    }
}

// Class representing a Square
class Square extends Shape{
    @Override
    void draw() { // 覆寫父類方法
        System.out.println("Drawing a square");
    }
}

class DrawTool {
    //using polymorphism
    void paint(Shape shape) {
        shape.draw(); // shape都有draw()這個方法
    }
}

// Client code
public class DrawingAppWithoutPolymorphism {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        Square mySquare = new Square();

        DrawTool tool = new DrawTool();

        // Drawing a circle
        tool.paint(myCircle);

        // Drawing a square
        tool.paint(mySquare);
    }
}