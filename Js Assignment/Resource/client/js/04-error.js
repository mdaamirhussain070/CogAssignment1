let div = function(x, y){
    if(y==0){
        throw new Error("Can not divide by zero")
    }
    return x/y;
}


try{
    div(5, 0)
} catch(e){
    console.log("Divide error: ");
    console.log(e.message)
}