#include <stdio.h>

int main()
{
    int n, i, value;

    printf("Enter size of sorted array: ");
    scanf("%d", &n);

    int arr[n + 1];

    printf("Enter sorted elements:\n");

    for(i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Enter value to insert: ");
    scanf("%d", &value);

    for(i = n - 1; i >= 0 && arr[i] >= value; i--)
    {
        arr[i + 1] = arr[i];
    }

    arr[i + 1] = value;

    printf("Updated Array:\n");

    for(i = 0; i <= n; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}