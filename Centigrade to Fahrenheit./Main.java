#include<stdio.h>
int main()
{
  	float fahrenheit,centigrade;
    scanf("%f",&centigrade);
    fahrenheit=(centigrade*9/5)+32;
    printf("%0.2f",fahrenheit);
}