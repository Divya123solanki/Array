// Find the pick elememnt of an array
let a=[1,4,2,5,3,7,9];
   for(let i=1;i<a.length-1;i++){
      if(a[i]>a[i-1] && a[i]>a[i+1]){
        console.log(a[i]);
      }
   }