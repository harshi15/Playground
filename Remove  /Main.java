#include<iostream>
#include<string>
using namespace std;
static void FindAndReplace(std::string & original, const std::string & kickout, const std::string & kickin)
{
  std::string::size_type pos=0u;
 while((pos = original.find(kickout,pos))!=std::string::npos)
 {
   original.replace(pos,kickout.length(),kickin);
   pos+=kickin.length();
 }
}
int main(int argc,char *argv[])
{
  std::string S;
  getline(std::cin,S);
  FindAndReplace(S,"the ","");
  std::cout<<S<<std::endl;
  //Type your code here.
  return 0;
}