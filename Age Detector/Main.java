#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,r;
  std::cin>>x>>y;
  if(x>20)
  {
  x=x+1900;
  }
  else
  {
    x=x+2000;
  }
  if(y>50)
  {
    y=y+1900;
  }
  else
  {
  y=y+2000;
  }
  if(y>x)
  {
  r=y-x;
  }
  else
  {
    r=x-y;
  }
    std::cout<<r;
}