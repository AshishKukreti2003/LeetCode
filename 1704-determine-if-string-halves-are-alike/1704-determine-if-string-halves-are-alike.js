/**
 * @param {string} s
 * @return {boolean}
 */
var halvesAreAlike = function(s) {
    let count1 = check(s,0,Math.floor(s.length/2));
    let count2 = check(s,Math.floor(s.length/2), s.length);
    
    return count1 === count2;
    
    function check(s, start, end){
        let count = 0;
        for(let i=start;i<end;i++){
            let ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                count++;
            }
        }
        return count;
    }
};
