#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,a;
  std::cin>>x>>y;
  a=2*x;
  if(a==y)
  {
    std::cout<<"circle can be inside a square";
  }
  else
    std::cout<<"circle cannot be inside a square";
}