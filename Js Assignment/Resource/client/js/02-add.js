var add = function(){
    let result = 0;
    // console.log(arguments)
    for(let i=0;i<arguments.length;i++){
        if(!isNaN(+arguments[i])){
            result += +arguments[i];
        }
    }
    return result;
}

add(4, 7);
add(9, 4, 6, 8);
add(3, "6", new Object())
add(null, null, true, 44)

