/**
 * @param {number[][]} mat
 * @param {number[][]} target
 * @return {boolean}
 */
var findRotation = function(mat, target) {
    
    for(let i=0;i<4;i++){
        if(check(mat,target)){
            return true;
        }
        rotate(mat);
    }
    
    return false;
    
    function rotate(mat){
        let n = mat.length;
        for(let i=0;i<n;i++){
            for(let j=i;j<n;j++){
                let temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(let i=0;i<n;i++){
            for(let j=0;j<n/2;j++){
                let temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
    }
    
    function check(mat,target){
        let n = mat.length;
        for(let i=0;i<n;i++){
            for(let j=0;j<n;j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
};