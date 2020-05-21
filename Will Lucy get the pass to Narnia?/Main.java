#include<iostream>
using namespace std;
int main()
{
  int x,y,k;
  std::cout<<"Enter first number : ";
  std::cin>>x;
  std::cout<<"Enter second number : ";
  std::cin>>y;
  std::cout<<"Menu\n";
  std::cin>>k;
  std::cout<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication\n"<<"4.Division"<<"\n"<<"5.Remainder\n";
   switch(k)
   {
     case 1:
       std::cout<<x+y;
       break;
     case 2:
       std::cout<<x-y;
       break;
     case 3:
       std::cout<<x*y;
       break;
     case 4:
       std::cout<<x/y;
       break;
     case 5:
       std::cout<<x%y;
       break;
     default:
       std::cout<<"Invalid operation";
   }
}