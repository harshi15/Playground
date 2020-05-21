#include<iostream>
using namespace std;
int main()
{
  int a,b,res;
  cin>>a>>b;
  if(a<b)
  {
    res=a;
  }
  else
  {
    res=b;
  }
  if(res%2==0)
  {
    cout<<"Mani Iyer";
  }
  else
  {
    cout<<"Arun Gupta";
  }
  return 0;
  //Type your code here.
}