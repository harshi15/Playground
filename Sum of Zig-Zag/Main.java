#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,sum=0;
  cin>>r>>c;
  int a[100][100];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  if(r==2 & c==2)
  {
    for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      sum=sum+a[i][j];
    }
    }
  }
  else
  {
     for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(i==0 || i==2 || (i==1 && j==1))
        sum=sum+a[i][j];
    }
     }
  }
   cout<<"Sum of Zig-Zag pattern is "<<sum; 
    
  //Type your code here.
}