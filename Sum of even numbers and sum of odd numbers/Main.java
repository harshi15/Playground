#include<iostream>
using namespace std;
int main()
{
  int n,a[15],sum=0,c=0,i;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      sum=sum+a[i];
    }
    else
    {
      c=c+a[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<sum;
  cout<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<c;
  //Type your code here.
}