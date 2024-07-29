/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    const newS = s.trim();
    let count = 0;
    for(let i=newS.length-1;i>=0;i--){
        if(newS.charAt(i) != ' '){
            count++;
        }else{
            break;
        }
    }
    return count;
};