class Triangle {

    double side1, side2, side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if(side1 <= 0 || side1 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
            throw new TriangleException();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    TriangleKind getKind() {
        if(side1 == side2 && side2 == side3) return TriangleKind.EQUILATERAL;
        if(side1 == side2 || side1 == side3 || side2 == side3) return TriangleKind.ISOSCELES;
        return TriangleKind.SCALENE;
    }

}
