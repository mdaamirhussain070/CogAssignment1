// object without class

let item = new Object();
item.name = "mobile";
item.price = 12000

let employee = {
    name: "Arun",
    salary: 20000,
    age: 40
}
employee.address = "Japan";

class Book{
    constructor(t, a, p){
        this.title = t;
        this.author = a;
        this.price = p;
    }

    details(){
        return `Book[title: ${this.title}, author: ${this.author}, price: ${this.price}]`
    }
}

let book = new Book("Spiderman", "Clark", 1.4);

book.category = "comic"
delete book.author

book.title = "Spiderman is back"



//array
let heros = ["superman", "hulk", "shaktiman", "ironman"];

heros.push("antman")
heros.pop()

heros.splice(2, 1)

heros.sort().reverse()