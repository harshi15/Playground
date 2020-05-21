#include<iostream>
using namespace std;
int main(){
  int n,*a,even=0,odd=0,i;
  cin>>n;
  a=(int *)malloc (n*sizeof(int));
  for(i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  for(i=0;i<n;i++)
  {
    if((*(a+i))%2==0)
      even++;
    else
      odd++;
  }
  cout<<odd<<"\n";
  cout<<even;
  // Type your code here
  return 0;
}