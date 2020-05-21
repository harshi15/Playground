#include<iostream>
using namespace std;
int fact(int n)
{
  if(n>1)
    return n*fact(n-1);
  else
    return 1;
}
int main()
{
  int n,f;
  cin>>n;
  fact(n);
  cout<<"The factorial of "<<n<<" is "<<fact(n);
  //Type your code here.
}