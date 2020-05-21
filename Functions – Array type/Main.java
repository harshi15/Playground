#include<iostream>
using namespace std;
int main()
{
  int m,a[20],c=0,d=0,e=0,i;
  cout<<"Enter the number of elements in the array \n";
  cin>>m;
  cout<<"Enter the elements in the array \n";
  for(i=0;i<m;i++)
  {
    cin>>a[i];
}
for(i=0;i<m;i++)
{
  if(a[i]%2==0)
    c++;
  else
    d++;
}
for(i=0;i<m;i++)
{
  if(a[i]%2!=0)
    e++;
}
if(c>=1 && d>=1)
  cout<<"The array is Mixed";
else if(e>=1)
  cout<<"The array is Odd";
else
  cout<<"The array is Even";
  //Type your code here.
}