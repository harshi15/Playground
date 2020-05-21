#include<iostream>
using namespace std;
int main()
{
  int n,sum=10,m;
  cin>>n;
  while(sum>=10)
  {
    sum=0;
    while(n!=0)
    {
      m=n%10;
      sum=sum+m;
      n=n/10;
    }
    n=sum;
  }
  cout<<sum;
}