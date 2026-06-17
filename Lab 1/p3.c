#include <stdio.h>

int main()
{
    float principal, rate, time, si;

    printf("Enter Principal Amount: ");
    scanf("%f", &principal);

    printf("Enter Rate of Interest: ");
    scanf("%f", &rate);

    printf("Enter Time Period: ");
    scanf("%f", &time);

    si = (principal * rate * time) / 100;

    printf("Simple Interest = %.2f", si);

    return 0;
}