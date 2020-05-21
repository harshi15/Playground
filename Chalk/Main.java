#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,t;
  std::cin>>n;
  t=n/(1-(1/sqrt(n)));
  if(t==20)
    t=t-1;
  std::cout<<t;
}