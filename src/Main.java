public class Main {
    public void main(String[] args) {
        Rectangle rectangle1 = new  Rectangle(2,4);
        Rectangle rectangle2= new Rectangle(5,6);

        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculateCircumference());
        ;
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculateCircumference());
    }


    class Rectangle {
        int length, breadth;


        public Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        double calculateArea() {
            return length * breadth;
        }

        double calculateCircumference() {
            return 2 * (length + breadth);
        }
    }
}

