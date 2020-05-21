#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,num,m,n,count=0;
  cin>>r>>c;
  cin>>num;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(i==0||j==0)
        a[i][j]=1;
      else if(j==c-1)
        a[i][j]=1;
      else
        a[i][j]=0;
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      count++;
      if(count==num)
      {
        m=i;
        n=j;
        break;
      }
    }
  }
  if(a[m][n]==1)
    cout<<"Yes";
  else
    cout<<"No";
  //Type your code here.
}