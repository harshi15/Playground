#include<iostream>
#include<string>
using namespace std;
int main()
{
  char str[100];
  int count=0,i;
  gets(str);
  for(i=0;str[i]!=0;i++)
  {
    cin>>str[i];
    count++;
  }
  cout<<"The number of letters in the name is "<<count;
  //Type your code here.
}