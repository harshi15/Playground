#include<iostream>
int main()
{
  int r,c,i,j;
  std::cin>>r>>c;
 int a[100][100],b[100][100],m[100][100];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
   for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>b[i][j];
    }
   }
 for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      m[i][j]=a[i][j]+b[i][j];
    }
 }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cout<<m[i][j]<<" ";
    }
    std::cout<<"\n";
    }
  return 0;
    // Type your code here
}