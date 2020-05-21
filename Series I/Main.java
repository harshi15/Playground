#include<iostream>
using namespace std;
int main()
{
  int n,i;
  float num=0.5;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    std::cout<<num<<" ";
    num=num*3;
  }
}
    
  