#include<iostream>
using namespace std;
int main()
{
  int n,a[100],flag=0,m,i;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>m;
  for(i=0;i<n;i++)
  {
    if(a[i]==m)
    {
      flag=1;
       break;
    }
  }
  if(flag==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
  
  // Type your code here
}