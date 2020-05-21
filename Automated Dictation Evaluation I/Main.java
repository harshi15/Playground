#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[100],str1[100];
  gets(str);
  gets(str1);
  if(strcmp(str,str1)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  //Type your code here.
}