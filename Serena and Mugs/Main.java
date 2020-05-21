#include<iostream>
using namespace std;
int main()
{
  int num,c,i,sum=0;
  cin>>num;
  cin>>c;
  int a[num];
  for(i=0;i<num;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<num;i++)
  {
    sum=sum+a[i];
  }
  if(sum<=c)
  {
    cout<<"YES";
  }
  else
  {
    cout<<"NO";
  }
  //Type your code here.
}