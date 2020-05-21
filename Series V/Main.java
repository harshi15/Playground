#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,k=11,j;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    j=k*k;
    k=k+4;
    std::cout<<j<<" ";
  }
}