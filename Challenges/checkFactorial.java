//78 CHARS
int checkFactorial(int n) {
    for(int a = 1; n!=1; a++){
        if(n%a != 0)
            return 0;
        n /= a;
    }
    return 1;
}