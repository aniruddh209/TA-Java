#include <stdio.h>

int main()
{
    int a[3][3];
    int i, j;
    int positive = 0, negative = 0, zero = 0;

    printf("Enter 3x3 matrix elements:\n");

    for(i = 0; i < 3; i++)
    {
        for(j = 0; j < 3; j++)
        {
            scanf("%d", &a[i][j]);

            if(a[i][j] > 0)
                positive++;
            else if(a[i][j] < 0)
                negative++;
            else
                zero++;
        }
    }

    printf("Positive = %d\n", positive);
    printf("Negative = %d\n", negative);
    printf("Zero = %d\n", zero);

    return 0;
}