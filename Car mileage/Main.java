#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m;
  int l,d,r;
  std::cin>>m>>l>>d;
  r=m*l;
  if(r>=d)
  {
    std::cout<<"Can reach";
  }
  else
    std::cout<<"Cannot reach";
  
}