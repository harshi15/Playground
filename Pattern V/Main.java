#include<iostream>
using namespace std;
int main()
{
  int n=3;
  cin>>n;
  int space,i,j,a,b;
  a=1;
  b=n*n+1;
  for(i=n;i>0;i--)
  {
    for(space=0;space<(n-i)*2;space++)
      cout<<"-";
    for(j=1;j<=i;j++)
    {
      cout<<a;
      cout<<"*";
      a++;
    }
    for(j=1;j<=i;j++)
    {
      cout<<b;
      if(j<i)
        cout<<"*";
      b++;
    }
    b=b-(i-1)*2-1;
    cout<<endl;
  }
}