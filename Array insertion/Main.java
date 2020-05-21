#include<iostream>
using namespace std;
int main()
{
  int n,a[20],i,l,b;
  cout<<"Enter the number of elements in the array \n";
  cin>>n;
  cout<<"Enter the elements in the array \n";
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element \n";
  cin>>l;
  if(l>n)
  {
    cout<<"Invalid Input \n";
  }
  else
  {
    cout<<"Enter the value to insert \n";
    cin>>b;
    --l;
    for(i=n;i>=l;i--)
    {
      a[i+1]=a[i];
    }
    a[l]=b;
    cout<<"Array after insertion is \n";
    for(i=0;i<=n;i++)
    {
      cout<<a[i]<<"\n";
    }
  }
  //Type your code here.
}