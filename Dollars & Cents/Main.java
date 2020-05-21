#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,dl,ce;
  std::cin>>a>>b>>c>>d;
  dl=a+c;
  ce=b+d;
  if(ce>100)
  {
    ce=ce-100;
    dl=dl+1;
  }
  std::cout<<dl<<"\n";
  std::cout<<ce;
  
}