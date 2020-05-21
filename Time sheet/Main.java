#include<iostream>
using namespace std;
int main()
{
  int a[7],sum=0,i,am=0;
  for(i=0;i<7;i++)
    cin>>a[i];
  for(i=0;i<7;i++)
    sum=sum+a[i];
  for(i=0;i<7;i++)
  {
    if(a[i]>8)
      am=am+(100*a[i])+(15*(a[i]-8));
    else
      am=am+(100*a[i]);
  }
  if(a[0]>0 || a[6]>0)
    am=am+(0.25*100*a[6])+(0.5*100*a[0]);
  else if(sum>40)
    am=am+(25*(sum-40));
  else
  {
  }
  cout<<am;
  //Type your code here.
}