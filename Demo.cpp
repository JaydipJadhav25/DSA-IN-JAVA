#include<iostream>
using namespace std;


void pattern1(int n ){
     for(int i = 0 ; i <n; i++){
        for(int j =0; j<n; j++){
          cout<<" * ";
        }
        cout<<endl;
     }
}


int main(){

  int t=0;
  cin>>t;
  // cin>>n;
  // pattern1(n);
  for(int i = 0; i<2; i++){
    int n ;
    cin>>n;
    pattern1(n);
    
  }

    return 0;
}