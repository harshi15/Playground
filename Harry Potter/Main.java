#include <iostream>
using namespace std;
int main()
{
   int n,first,last,sum;
    cin >> n;
    first = n/1000;
	last=n % 10;
	//for(first=n;first>=100;first=first/1000);
	cout<<first+last<<endl;
}