/**
 * @param {number} rows
 * @param {number} cols
 * @param {number} rStart
 * @param {number} cStart
 * @return {number[][]}
 */
var spiralMatrixIII = function(rows, cols, rStart, cStart) {
    let direction = [
        [0, 1],
        [1, 0],
        [0, -1],
        [-1, 0]
    ];

    let result = new Array(rows*cols).fill(0).map(() => new Array(2).fill(0));
    let steps = 0, dir = 0, count = 0;
    result[count++] = [rStart, cStart];
    while(count < rows*cols){
        if(dir === 0 || dir === 2){
            steps++;
        }
        for(let i=0;i<steps;i++){
            rStart += direction[dir][0];
            cStart += direction[dir][1];
            
            if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols){
                result[count++] = [rStart, cStart];
            }
        }
        dir = (dir+1)%4;
    }
    return result;
};