#include <iostream>
using namespace std;
int main(){
	int hour, minute;
	int cooking;
	
	cin >> hour >> minute;
	cin >> cooking;
	
	minute = minute+cooking;
	
	if(minute>=60){
		hour = hour + minute/60;
		minute = minute%60;
		if(hour>=24) hour = hour%24;
	}
	cout << hour << " " << minute;
	
	return 0;
}