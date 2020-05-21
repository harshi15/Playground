#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float ma=0.0;
  for(int i=0;i<3;)
  {
    std::cin>>n;
    if(n<0)
    {
      ma=ma-1;
      break;
    }
    else if(n%2==0)
    {
      ma=ma-0.5;
    }
    else
    {ma=ma+1;
     i++;
    }
  }std::cout<<ma;
}