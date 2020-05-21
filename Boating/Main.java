#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z,a,c,w;
  std::cin>>x>>y>>z;
  a=75*y;
  c=30*z;
  w=a+c;
  if(w<x)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
  
}