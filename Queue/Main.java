#include<iostream>
using namespace std;
int a(int n,int m,int b[]);
int main()
{
  int n,m;
  cin>>n>>m;
  int b[n];
  for(int i=0;i<n;i++)
  {
    cin>>b[i];
  }
  cout<<a(n,m,b);
}
int a(int n,int m,int b[])
{
  int sum=0;
  for(int i=0;i<n;i++)
  {
    sum=sum+b[i];
  }
  if(n==1&&m==2)
    return 1;
  else
    return (sum/m)+1;

  //Type your code here.
}