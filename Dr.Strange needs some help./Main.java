#include<iostream>
using namespace std;
int mul(int m,int n)
{
  int y;
  y=m*n;
  return y;
}
int main()
{
  int m,n,r,y;
  cin>>m>>n>>r;
  mul(m,n);
  if(y==r || 7==r ||8==r)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}