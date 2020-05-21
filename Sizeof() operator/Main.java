#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char c;
  int x;
  float f;
  double d;
  std::cin>>c>>x>>f>>d;
 std::cout<<sizeof(c)<<"\n"<<sizeof(x)<<"\n"<<sizeof(f)<<"\n"<<sizeof(d);
}