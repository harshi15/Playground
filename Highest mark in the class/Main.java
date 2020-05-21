#include<iostream>
int main()
{
   int size;
   int arr[10];
   std::cin>>size;
  
  for(int i=0;i<size;i++)
  {
    std::cin>>arr[i];
  }
  int large=0;
  for(int i=0;i<size;i++)
  {
    if (large < arr[i])
    {
      large=arr[i];
    }
  }
  std::cout<<large;
}
    