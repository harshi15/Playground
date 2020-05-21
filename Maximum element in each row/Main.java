#include<iostream>
using namespace std;
int main()
{
  int r,c,a[20][20],i,j,max;
   cin>>r>>c;
            for(i=0;i<r;i++)
            {
              for(j=0;j<c;j++)
              {
                cin>>a[i][j];
              }
            }
            for(i=0;i<r;i++)
            {
              max=0;
              for(i=0;i<r;i++)
              {
                max=0;
                for(j=0;j<c;j++)
                {
                if(a[i][j]>max)
                  max=a[i][j];
              }
              cout<<max<<"\n";
            }
            }
}