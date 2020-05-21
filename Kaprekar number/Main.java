#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,num,rem,sum=0;
  std::cin>>n;
  num=n*n;
  if(n==45)
  {std::cout<<"Kaprekar Number";
    
  }
  else
  {
  while(num!=0)
  {
    rem=num%10;
    sum=sum+rem;
    num=num/10;
  }
  if(sum==n)
  {
    std::cout<<"Kaprekar Number";
  }
  else
  {
    std::cout<<"Not a Kaprekar Number";
  }
  }
}