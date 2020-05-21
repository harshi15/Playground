#include<iostream>
using namespace std;
int main()
{
  int n,a[20][20],i,j,sum=0,sum2=0;
  cin>>n;
 for(i=0;i<n;i++)
 {
   for(j=0;j<n;j++)
   {
     cin>>a[i][j];
   }
 }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(i==j)
      sum=sum+a[i][j];
      if((i+j)==(n-1))
        sum2=sum2+a[i][j];
    }
  }
 if(sum==sum2)
    cout<<"Yes";
  else
    cout<<"No";
  //Type your code here.
}