#include <stdio.h>
int main()
{
    int n,sum=0,p=0,o=0,max,min,i,u,l=0;
    float avg;
    printf("num array :");
    scanf("%d",&n);
    int weight[n]={};

    for(u=0;u<n;u++)
    {
        printf("score :");
        scanf("%d",&weight[u]);

    }
    max=weight[0];
    min=weight[0];
    for(i=0;i<n;i++)
    {
        sum=sum+weight[i];
        if(weight[i]>max)
        {
            max=weight[i];
        }
        if(weight[i]<min)
        {
            min=weight[i];
        }
    }
    for(i=0;i<n;i++)
    {
        if(weight[i]<55)
        {
            printf("%d \t",weight[i]);
            printf("Light weight\n");
            p=p+1;
        }
        else if(weight[i]<=100)
        {
            printf("%d \t",weight[i]);
            printf("Middle weight\n");
            o=o+1;
        }
        else
        {
            printf("%d \t",weight[i]);
            printf("Heavy weight\n");
            l=l+1;
        }
    }
    avg=(float)sum/n;
    printf("\nMAX = %d\n",max);
    printf("MIN = %d\n",min);
    printf("AVG = %.2f\n",avg);
    printf("Light weight   =%d\n",p);
    printf("Middle weight  =%d\n",o);
    printf("Heavy weight   =%d\n",l);

}
