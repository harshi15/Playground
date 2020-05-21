#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,sum=0,attempt=0;
  std::cin>>a;
  while(sum<a)
  {
    std::cin>>b;
    sum=sum+b;
    attempt++;
  }
  std::cout<<"The number of turns is "<<attempt;
  
  
}