#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

#define ll unsigned long long int

void solve(){

    int n, k, q;
    cin >> n >> k >> q;

    const int MAX = 200002;

    vector<int> diff(MAX, 0);

    for(int i = 0; i < n; i++){

        int l, r;
        cin >> l >> r;

        diff[l]++;
        diff[r + 1]--;
    }

    vector<int> admissible(MAX, 0);

    int curr = 0;

    for(int temp = 1; temp < MAX; temp++){

        curr += diff[temp];

        if(curr >= k){
            admissible[temp] = 1;
        }
    }

    vector<int> prefix(MAX, 0);

    for(int i = 1; i < MAX; i++){

        prefix[i] =
            prefix[i - 1] + admissible[i];
    }

    while(q--){

        int a, b;
        cin >> a >> b;

        cout << prefix[b] - prefix[a - 1]
             << "\n";
    }
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T = 1;
    //cin >> T;

    while(T--) solve();
}
