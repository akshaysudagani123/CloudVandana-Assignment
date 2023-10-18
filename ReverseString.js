const sentence = "The quick brown fox jumped over the lazy dog"

function ReverseAString(sentence) {
 return sentence.split("").reverse().join("")

}

console.log("The reversed sentence is :"+ReverseAString(sentence))
