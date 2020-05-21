#include<iostream>
#include<cstring>
#include<string>
using namespace std;
struct college
{
  char name[100];
  char city[100];
  int establishmentyear;
  float passpercentage;
};
int main()
{
  int n;
  cout<<"Enter the number of colleges\n";
  (cin>>n).get();
  college s[n];
  college t;
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1<<"\n";
    cout<<"Enter name\n";
    cin>>s[i].name;
    cout<<"Enter city\n";
    cin>>s[i].city;
    cout<<"Enter year of establishment\n";
    cin>>s[i].establishmentyear;
    cout<<"Enter pass percentage\n";
    cin>>s[i].passpercentage;
  }
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      char *a[30]={s[i].name};
      char *b[30]={s[j].name};
      if(*a[0]>*b[0])
      {
        t=s[i];
        s[i]=s[j];
        s[j]=t;
      }
    }
  }
  cout<<"Details of colleges\n";
  for(int i=0;i<n;i++)
  {
    cout<<"College:"<<i+1<<"\n";
    cout<<"Name:"<<s[i].name<<"\n";
    cout<<"City:"<<s[i].city<<"\n";
    cout<<"Year of establishment:"<<s[i].establishmentyear<<"\n";
    cout<<"Pass percentage:"<<s[i].passpercentage<<"\n";
  }
  //Type your code here.
}