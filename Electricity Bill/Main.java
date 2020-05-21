#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c;
  std::cin>>n;
  if(n<=200)
  {
    c=n*0.5;
    std::cout<<"Rs."<<c;
  }
  else if(n<=400)
  {
    c=(n*0.65)+100;
    std::cout<<"Rs."<<c;
  }
  else if(n<=600)
  {
    c=(n*0.80)+200;
    std::cout<<"Rs."<<c;
  }
  else
  {
    c=(n*1.25)+425;
    std::cout<<"Rs."<<c;
  }
  
}