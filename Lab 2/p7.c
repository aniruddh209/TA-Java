#include <stdio.h>

float areaCircle(float r)
{
    return 3.14159 * r * r;
}

float areaTriangle(float b, float h)
{
    return 0.5 * b * h;
}

float areaSquare(float side)
{
    return side * side;
}

int main()
{
    float r, b, h, side;

    printf("Enter radius of circle: ");
    scanf("%f", &r);

    printf("Area of Circle = %.2f\n", areaCircle(r));

    printf("Enter base and height of triangle: ");
    scanf("%f %f", &b, &h);

    printf("Area of Triangle = %.2f\n", areaTriangle(b, h));

    printf("Enter side of square: ");
    scanf("%f", &side);

    printf("Area of Square = %.2f\n", areaSquare(side));

    return 0;
}