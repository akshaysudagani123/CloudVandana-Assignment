const arr = [10,65,24,89,54,67]

arr.sort(comparenumbers)
console.log(arr)

function comparenumbers(a,b) {
    return b-a
}
