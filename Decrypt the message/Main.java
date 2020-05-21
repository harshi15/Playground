#include<iostream>
using namespace std;
int main()
{
  int a,b,n,div,i,sum;
  std::cin>>a>>b;
  n=a+b;
  for(i=1;i<n;i++)
  {
    div=n%i;
    if(div==0)
    {
      sum=sum+i;
    }
  }
  if(sum==n)
  {
    std::cout<<"They can read the message";
  }
  else
  {
    std::cout<<"They can't read the message";
  }
}