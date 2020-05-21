#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,x2,x3,x,e;
  int y1,y2,y3,y,f;
  int z1,z2,z3,z,g;
  std::cin>>x1>>x2>>x3;
  std::cin>>y1>>y2>>y3;
  std::cin>>z1>>z2>>z3;
  x=(x1*x2)/100;
 e=x1-x;
  y=(y1*y2)/100;
  f=y1-y;
  z=(z1*z2)/100;
  g=z1-z;
  std::cout<<"In Flipkart Rs."<<e+x3; 
  std::cout<<"\nIn Snapdeal Rs."<<f+y3;
 std::cout<<"\nIn Amazon Rs."<<g+z3;
  if(e<=f && e<=g)
  {
    std::cout<<"\nHe will prefer Flipkart";
  }
  else if(f<=e && f<=g)
  {
    std::cout<<"\nHe will prefer Snapdeal";
  }
  else
  {
    std::cout<<"\nHe will prefer Amazon";
  }
}