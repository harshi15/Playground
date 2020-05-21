#include<iostream>
using namespace std;
int main()
{
  int n,i,j,k,p=1;
  cin>>n;
  for(i=0;i<n;i++)
  {
    if(i%2==0)
      for(j=0;j<=i;j++)
      {
        cout<<p++;
        if((j+1)<=i)
       cout<<"*";
           }
 else
   for(j=0,k=p+i;j<=i;j++,p++)
   {
     std::cout<<k--;
     if((j+1)<=i)
      cout<<"*";
   }
   cout<<endl;
  }
}