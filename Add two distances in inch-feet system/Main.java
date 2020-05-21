#include<iostream>
using namespace std;
struct dist
{
  int i;
  float f;
};

int main()
{
  struct dist d1;
  struct dist d2;
  cin>>d1.i;
  cin>>d1.f;
  cin>>d2.i;
  cin>>d2.f;
  float b=d1.f+d2.f;
  int a=d1.i+d2.i;
  if(b>12)
  {
    b=b-12;
    a++;
  }
  cout<<a<<"'"<<"-"<<b<<"\"";
  //Type your code here.
}