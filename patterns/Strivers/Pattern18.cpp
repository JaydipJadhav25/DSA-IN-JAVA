#include<iostream>
using namespace std;


int main(){
    char end = 'A'+5-1; 
    for(int i =0 ; i<5 ;i++){
        int start = 'E'-i;
        for(char ch = start; ch<=end; ch++){
            cout<<ch<<" ";
        }
        cout<<endl;
    }


    return 0;
}