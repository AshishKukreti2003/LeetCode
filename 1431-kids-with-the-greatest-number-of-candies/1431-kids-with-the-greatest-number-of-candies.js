/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    const arr = [];
    let max = candies[0];
    for(let i=1;i<candies.length;i++){
        max = Math.max(max,candies[i]);
    }
    for(let i=0;i<candies.length;i++){
        if(candies[i]+extraCandies >= max){
            arr.push(true);
        }else{
            arr.push(false)
        }
    }
    return arr;
};