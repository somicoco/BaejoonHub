#include <iostream>
using namespace std;
int main(){
	int x, n, a, b;
	
	int result = 0;
	
	cin >> x;
	cin >> n;
	for(int i = 0; i<n; i++){
		cin >> a >> b;
		result += a*b;
	}
	x==result? cout << "Yes" : cout << "No";
	
	return 0;
}