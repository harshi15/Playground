#include<iostream>
using namespace std;
struct time
{
  int h;
  int m;
  int s;
};
int main()
{
  struct time  s1;
  struct time s2;
  cin>>s1.h;
  cin>>s1.m;
  cin>>s1.s;
  cin>>s2.h;
  cin>>s2.m;
  cin>>s2.s;
  int a=s1.h-s2.h;
  int b,c;
  if(s1.m<s2.m)
  {
    b=60+(s1.m-s2.m);
  a--;
}
else
{
  b=s1.m-s2.m;
}
if(s1.s<s2.s)
{
  c=60+(s1.s-s2.s);
  b--;
}
else
{
  c=s1.s-s2.s;
}
cout<<a<<":"<<b<<":"<<c;
}