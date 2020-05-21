#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,rem,sum=0,sum1=0;
  std::cin>>n;
  while(n!=0)
  {
    rem=n%10;
    if(rem%2==0)
    {
      sum=sum+rem;
      n=n/10;
    }
    else
    {
      sum1=sum1+rem;
      n=n/10;
    }
  }
  if(sum==sum1)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}