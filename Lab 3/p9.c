#include <stdio.h>

int main()
{
    int n, i;
    int even = 0, odd = 0;

    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter elements:\n");

    for(i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);

        if(arr[i] % 2 == 0)
            even++;
        else
            odd++;
    }

    printf("Even Numbers = %d\n", even);
    printf("Odd Numbers = %d\n", odd);

    return 0;
}