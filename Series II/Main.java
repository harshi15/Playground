#include<iostream>
using namespace std;
int main()
{
  int n,i,num=11,k;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    k=num*num;
    std::cout<<k<<" ";
    num=num+4;
  }
}
    
    
    