#include <stdio.h>

int main()
{
    float radius, area;
    float pi = 3.14159;

    printf("Enter radius: ");
    scanf("%f", &radius);

    area = pi * radius * radius;

    printf("Area of Circle = %.2f", area);

    return 0;
}