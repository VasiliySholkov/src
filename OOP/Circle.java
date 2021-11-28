package OOP;

class Circle {

        public double x;        //  свойства (атрибут или поле) нашего класса
        public double y;        //  свойства (атрибут или поле) нашего класса
        public double r;        //  свойства (атрибут или поле) нашего класса

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }


    public void printCircle(){        //  метод нашего класса
            System.out.println("Окружность с центром("+x+";"+y+") и радиусом "+r);
        }
    }


