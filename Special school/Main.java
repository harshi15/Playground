#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s1,s2;
  int size=0;
  getline(cin,s1);
  getline(cin,s2);
  int n=s1.length();
  int m=n;
  for(int i=0;i<m;i++,n--)
  {
    if(s1[i]==s2[n-1])
    {
      size++;
    }
  }
  if(size==m)
  {
    std::cout<<"It is correct";
  }
  else
  {
    std::cout<<"It is wrong";
  }
  
  //Type your code here.
}