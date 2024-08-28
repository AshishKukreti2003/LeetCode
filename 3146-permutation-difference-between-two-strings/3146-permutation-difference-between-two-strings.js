/**
 * @param {string} s
 * @param {string} t
 * @return {number}
 */
var findPermutationDifference = function(s, t) {
    let sum = 0;
    for(let i=0;i<s.length;i++){
        for(let j=0;j<t.length;j++){
            if(s.charAt(i) === t.charAt(j)){
                sum+=Math.abs(i-j);
            }
        }
    }
    return sum;
};