// Second Question -->

function sort(arr){
 for(let i=0; i<arr.length; i++){
  for(let j=i+1; j<arr.length; j++){
    if(arr[i] < arr[j]){
        let temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
  }
 }
 return arr;
}


const arr = [2, 5, 1, 4, 8];
const sorted  = sort(arr);
console.log(sorted);