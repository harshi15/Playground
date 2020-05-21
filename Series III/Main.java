#include<iostream>
using namespace std;
int main()
{
  int n,i,num=6,k=5,j;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    j=k*i;
    //std::cout<<j<<" ";
    std::cout<<num<<" ";
    num=num+j;
  }
   
  }
    