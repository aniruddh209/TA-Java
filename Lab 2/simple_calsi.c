#include <stdio.h>

int main() {
    int arr[5];
    int i;
    char op;
    int result;

    printf("Enter 5 numbers:\n");
    for (i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter operation (+, -, *, /): ");
    scanf(" %c", &op);

    switch (op) {

        case '+':
            result = 0;
            for (i = 0; i < 5; i++) {
                result = result + arr[i];
            }
            printf("Sum = %d", result);
            break;

        case '-':
            result = arr[0];
            for (i = 1; i < 5; i++) {
                result = result - arr[i];
            }
            printf("Result = %d", result);
            break;

        case '*':
            result = 1;
            for (i = 0; i < 5; i++) {
                result = result * arr[i];
            }
            printf("Product = %d", result);
            break;

        case '/':
            result = arr[0];
            for (i = 1; i < 5; i++) {
                if (arr[i] == 0) {
                    printf("Division by zero is not possible.");
                    return 0;
                }
                result = result / arr[i];
            }
            printf("Result = %d", result);
            break;

        default:
            printf("Invalid Operation");
    }

    return 0;
}