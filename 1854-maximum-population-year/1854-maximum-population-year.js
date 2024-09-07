/**
 * @param {number[][]} logs
 * @return {number}
 */
var maximumPopulation = function(logs) {
    let arr = new Array(101).fill(0);
    for(let log of logs){
        let by = log[0] , dy = log[1];
        arr[by-1950]++;
        arr[dy-1950]--;
    }
    let max = arr[0];
    let maxYear = 1950;
    for(let i=1;i<101;i++){
        arr[i]+=arr[i-1];
        if(max< arr[i]){
            max = arr[i];
            maxYear = i+1950;
        }
    }
    return maxYear;
};