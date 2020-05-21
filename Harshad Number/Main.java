#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,rem,sum=0,num;
  std::cin>>n;
  num=n;
  while(n>0)
  {
    rem=n%10;
    sum=sum+rem;
    n=n/10;
  }
  if((num%sum)==0)
  {
    std::cout<<"Harshad Number";
  }
  else
    std::cout<<"Not Harshad Number";
}