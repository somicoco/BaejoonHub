#include <iostream>

using namespace std;

int rev(int n){
	int a = 0;
	int r = 0;
	
	while(n>0){
		a = n%10;
		n = n/10;
		r = r*10+a;
	}
	
	return r;
}



int main(){
	int num1, num2;
	cin >> num1 >> num2;
	
	int result = rev(num1)>rev(num2)?rev(num1):rev(num2);
	
	
	
	
	cout << result <<endl;

}