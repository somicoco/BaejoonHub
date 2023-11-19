#include <iostream>
#include <string>
using namespace std;

int main(){
	
	string str;
	int cnt = 0;
	
	cin >> str;
	
	for(int i = 0; i<str.length(); i++){
		if(str[i]!=str.length()-1)
		if(str[i]!=str[i+1])
			cnt++;
	}
	
	if(!cnt){
		cout<<cnt;
	}
	else{
		cout<<cnt/2;
	}
	
	
	

	
}