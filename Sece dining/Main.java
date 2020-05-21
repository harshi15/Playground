#include<iostream>
using namespace std;
int main()
{
  int a,c;
  string m;
  cin>>m>>a;
  if(m=="front")
  {
    if(a==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else
  {
    if(a==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
  //Type your code here.
}