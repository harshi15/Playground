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
            for(i=0;i<c;i++)
            {
              max=0;
              for(j=0;j<r;j++)
              {
                if(a[j][i]>max)
                  max=a[j][i];
              }
              cout<<max<<"\n";
            }
  //Type your code here.
}