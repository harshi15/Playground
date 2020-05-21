#include<iostream>
using namespace std;
int main() {
	int i,j,a,b,k=1;
  std::cin>>a;
  b=a+3;
	for (i=a;i<=b;i++) {
		for (j=1;j<=k;j++) {
			if(j<i) 
			        std::cout<<i; else 
			        std::cout<<i;
		}
		std::cout<<"\n";
      k++;
	}
	for (i=b;i>=a;i--) {
      k--;
		for (j=1;j<=k;j++) {
			if(j<i) 
			        std::cout<<i; else 
			        std::cout<<i;
		}
		std::cout<<"\n";
     
	}
	return 0;
}