#include<iostream>
using namespace std;
int fib(int m)
{
  if(m==0 || m==1)
    return m;
  else
    return(fib(m-1)+fib(m-2));
}
int main()
{
  int n,m;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n-1);
  //Type your code here.
}