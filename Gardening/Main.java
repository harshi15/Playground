#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,n;
  std::cin>>x>>y>>n;
   if(x+y==n || (x+y)*2==n)
  //if(n%2==0)
  {
    std::cout<<"It is a mango tree";
  }
  else
  {
    std::cout<<"It is not a mango tree";
  }
}