#include<iostream>
using namespace std;
int main()
{
  int r,c,a[20][20],s,d,i,j,p=0,count=0,b=0,co=0;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {
    s=0;
    for(j=0;j<c;j++)
    {
      s=s+a[i][j];
    }
    cout<<s<<" ";
    if(s>p)
    {
      p=s;
      count++;
    }
  }
  cout<<"\n";
  if(count==3)
    cout<<"Row 3 has maximum sum\n";
  else if(count==2)
    cout<<"Row 2 has maximum sum\n";
  else
   cout<<"Row 1 has maximum sum\n";
  cout<<"Sum of columns is ";
  for(i=0;i<r;i++)
  {
    d=0;
    for(j=0;j<c;j++)
    {
      d=d+a[j][i];
    }
    cout<<d<<" ";
    if(d>b)
    {
      b=d;
      co++;
    }
  }
  cout<<"\n";
  if(co==3)
    cout<<"Column 3 has maximum sum\n";
  else if(co==2)
     cout<<"Column 2 has maximum sum\n";
  else
     cout<<"Column 1 has maximum sum\n";
  //Type your code here.
}