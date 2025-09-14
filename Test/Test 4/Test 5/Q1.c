#include <stdio.h>
float calculateSellingPrice(float costPrice, float discount);
void main()
{
    float cost, discount, sellingPrice;

    printf("Enter cost price of the book: ");
    scanf("%f", &cost);
    printf("Enter discount percentage: ");
    scanf("%f", &discount);
    sellingPrice = calculateSellingPrice(cost, discount);
    printf("Selling Price = %.2f\n", sellingPrice);
}
float calculateSellingPrice(float costPrice, float discount)
{
    float sellingPrice;
    if (discount > 0)
    {
        if (discount < 100)
            sellingPrice = costPrice - (costPrice * discount / 100);
        else
            sellingPrice = 0;
    }
    else
    {
        sellingPrice = costPrice;
    }
    return sellingPrice;
}

