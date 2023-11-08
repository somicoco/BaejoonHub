

#include <iostream>

using namespace std;

int main()
{
    int king = 1;
	int queen = 1;
	int rook = 2;
	int bishop = 2;
	int knight = 2;
	int pawn = 8;
	
	int i_king, i_queen, i_rook, i_bishop, i_knight, i_pawn;
	
	cin >> i_king >> i_queen >> i_rook >> i_bishop >> i_knight >> i_pawn;
	
	cout << king - i_king << " ";
	cout << queen - i_queen << " ";
	cout << rook - i_rook << " ";
	cout << bishop - i_bishop << " ";
	cout << knight - i_knight << " ";
	cout << pawn - i_pawn << " ";
    
    

    return 0;
}
