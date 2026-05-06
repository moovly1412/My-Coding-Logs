#include <stdio.h>
#include <math.h>
int main()
{
    int a,n,i,sum=0;
    float mean,x,sumDiv2=0,varian,SD;
    printf("Your array :");
    scanf("%d",&n);
    int score[n]={};
    float Div[n]={};
    float Div2[n]={};
    int count1[5]={};
    for(i=0;i<n;i++)
    {
        printf("Your score:");
        scanf("%d",&score[i]);
        sum=sum+score[i];
    }
    printf("\n");
    printf("score");
    printf("\t");
    for(i=0;i<n;i++)
    {
        printf("%d\t",score[i]);
    }
    mean=(float)sum/n;
    printf("\n\n");
    printf("mean");
    printf("\t%.3f",mean);
    printf("\n\n");
    for(i=0;i<n;i++)
    {

        Div[i]=score[i]-mean;
    }
    printf("\t");

    for(i=0;i<n;i++)
    {
        printf("%.3f\t",Div[i]);
    }
    for(i=0;i<n;i++)
    {
        Div2[i]=pow(Div[i],2);
    }
    printf("\n\n");
    printf("\t");
    for(i=0;i<n;i++)
    {
        printf("%.3f\t",Div2[i]);
    }
    for(i=0;i<n;i++)
    {
        sumDiv2=sumDiv2+Div2[i];
    }
    printf("\n\n");
    printf("\t");

    printf("%.2f",sumDiv2);

    printf("\n\n");
    printf("\t");
    varian=sumDiv2/(n-1);
    printf("%.3f",varian);
    printf("\n\n");
    printf("\t");
    SD = sqrt(varian);
    printf("%.2f",SD);
    printf("\n\n");
    printf("score");
    printf("\t");
    for(i=0;i<n;i++)
    {
        printf("%d\t",score[i]);
    }
    printf("\n\n");
    printf("\t");
    for(i=0;i<n;i++)
    {
      if (score[i] >= 80 )
      {
        printf("A\t");
        count1[0]=count1[0]+1;
      }
      else if (score[i] >= 70)
      {
        printf("B\t");
        count1[1]=count1[1]+1;
      }
      else if (score[i]>= 60)
      {
        printf("C\t");
        count1[2]=count1[2]+1;
      }
      else if (score[i]>= 50)
      {
        printf("D\t");
        count1[3]=count1[3]+1;
      }
      else
      {
        printf("F\t");
        count1[4]=count1[4]+1;
      }
    }

    for(int j=5;j>0;j--)
    {
        printf("\t");
        for(i=0;i<5;i++)
        {
            if(j==count1[i]+1)
            {
                printf("%d\t",count1[i]);
            }
            else if(j>count1[i])
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
    printf("\tA\tB\tC\tD\tF");

}
