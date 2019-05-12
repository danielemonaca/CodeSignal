//139 CHARS
Object isMonotonous(int[] s) {

        int d = 0,t = 1,r = 1, i = 0;
            
        for (; i < s.length-1; i++) {       
            if(s[i] <= s[i+1])
                t = 0;
            if(s[i] >= s[i+1])
                r = 0; 
        }
    
        return t==1 || r == 1 ? true : false;

}