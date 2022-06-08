#include <iostream>
#include <map>
#include <string>
using namespace std;

int main() {
  int n;
  int m;
  cin >> n;
  map<string, int> hojunMap;
  for(int i = 0; i < n; ++i) {
    string in;
    cin >> in;
    auto check = hojunMap.find(in);
    if(check == hojunMap.end()) {
      hojunMap[in] = 1;
    } else {
      hojunMap[in]++;
    }
  }

  cin >> m;
  for(int i = 0; i < m; ++i) {
    string in;
    cin >> in;
    auto check = hojunMap.find(in);
    if(check != hojunMap.end()) {
      hojunMap[in]--;
    }
  }

  for(auto& elem : hojunMap) {
    for(int i = 0; i < elem.second; ++i) {
      cout << elem.first << '\n';
    }
  }
}
