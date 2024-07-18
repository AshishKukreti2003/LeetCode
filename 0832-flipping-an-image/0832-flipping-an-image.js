/**
 * @param {number[][]} image
 * @return {number[][]}
 */
var flipAndInvertImage = function(image) {
    const n = image.length;
    for(let i=0;i<n;i++){
        let left = 0, right = n-1;
        while(left<right){
            let temp = image[i][left];
            image[i][left] = image[i][right];
            image[i][right] = temp;
            left++;
            right--;
        }
    }
    for(let i=0;i<n;i++){
        for(let j=0;j<n;j++){
            image[i][j] = 1-image[i][j];
        }
    }
    return image;
};