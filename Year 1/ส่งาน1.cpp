#include <stdio.h>
int main()
{
    int i,n,num,Max;
    printf("Input your array :");
    scanf("%d",&n);
    int data[n]={};
    printf("\n");
    Max=0;

    for(i=0;i<n;i++)
    {
        printf("Input your number :");
        scanf("%d",&data[i]);
        if(data[i]>Max)
        {
            Max=data[i];
        }
    }
    for(int j=Max;j>0;j--)
    {
        for(i=0;i<n;i++)
        {
            if(j>data[i])
            {
                printf("\t");
            }
            else
            {
                printf("*\t");
            }
        }
        printf("\n");
    }
    for(int t=0;t<n;t++)
        {
            printf("%d\t",data[t]);

        }
}
