
function logData(data){
    console.log(data);
}

function printData(data, cb){
    console.log("Printing: "+data);
    cb(data);
}

function readfile(path, cb){
    console.log("Reading file: "+path);
    let str = "Employee is not coming to manager to take salary";
    cb(str);
}

function saveInDb(data, cb){
    console.log("Saving: "+data);
    cb(data);
}

function readfile(path, cb){
    console.log("Reading file: "+path);
    let str = "Employee is not coming to manager to take salary";
    cb(str);
}




// Read file
// readfile("abc folder", function(d){
//     console.log(d);
// });

readfile("abc folder", function(d){
    saveInDb(d, function(res){
        printData(res, function(n){

        }, function(){

        })
    })
});

// callback hell


// readfile().then(printData).then(saveInDb)

console.log("before promise")
new Promise(function(resolve, reject){
    // your logic
    let sec = new Date().getSeconds();
    if(sec%2==0){
        resolve(sec);
    } else {
        reject("Getting odd number");
    }
}).then(function(res){
    console.log("Doing task 1: "+res);
    return res;
}).then(function(d){
    console.log("Doing task 2: "+d)
    return d;
}).then(function(r){
    console.log("Doing task 3: "+r)
    return r;
}).then(result=>{
    console.log("Doing task 4: "+result)
}).catch(function(e){
    console.log(e)
})

console.log("after promise");
