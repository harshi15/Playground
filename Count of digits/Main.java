#include<iostream>
int main()
{
  // Type your code here
  int n,i=0;
  std::cin>>n;
  if(n==0)
  {
    n=1;
  }
  while(n>0)
  {
    n=n/10;
    //::cout<<n<<"\n";
    i++;
  }
  std::cout<<i;
}