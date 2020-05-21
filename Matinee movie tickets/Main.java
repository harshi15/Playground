#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float t;
  std::cin>>a>>t;
  if(a>13)
  {
    if(t<12)
    {
      std::cout<<"$8.00";
    }
    else
    {
      std::cout<<"$5.00";
    }
  }
  else
  {
    if(t<12)
    {
      std::cout<<"$4.00";
    }
    else
    {
      std::cout<<"$2.00";
    }
  }
    
  
}