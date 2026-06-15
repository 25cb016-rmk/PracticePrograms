#include<iostream>
using namespace std;
int main(){
int n, m;
cin >> n >> m;
int a[n][m];

for(int i = 0;i < n;i++){
for(int j = 0;j < m;j++){
cin >> a[i][j];
} }
int r, c;
cin >> r >> c;
int sum = 0;
if(r > 0) 
sum += a[r - 1][c];
if(r < n -1)
sum += a[r + 1][c];
if(c > 0)
sum += a[r][c - 1];
if(c < n - 1)
sum += a[r][c + 1];
cout << sum;
return 0;
}
